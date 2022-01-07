package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidproject.Repository.UserRepository;
import com.example.androidproject.ViewModel.UserViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    UserAdapter adapter;
    Button fetchData;

    private List<UserDetails>userDetailsList;
    private UserRepository userRepository;
    private UserViewModel userViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fetchData = findViewById(R.id.fetchData);

        fetchData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

       // userRepository = new UserRepository(getApplication());


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        User users = retrofit.create(User.class);
        Call<List<UserDetails>> call = users.getUserDetails();
        call.enqueue(new Callback<List<UserDetails>>() {
            @Override
            public void onResponse(Call<List<UserDetails>> call, Response<List<UserDetails>> response) {
                if (!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.code(),Toast.LENGTH_SHORT).show();
                    return;
                }
               // userRepository.insert(response.body());
                List<UserDetails> userDetailsList = response.body();
                adapter = new UserAdapter(MainActivity.this,userDetailsList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<UserDetails>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}