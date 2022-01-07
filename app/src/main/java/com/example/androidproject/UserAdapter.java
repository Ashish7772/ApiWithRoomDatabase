package com.example.androidproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    List<UserDetails> UserDetailsList;
    Context context;
    public UserAdapter(Context context,List<UserDetails> userDetailsList ) {
        this.context = context;
        UserDetailsList = userDetailsList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.usershow,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {
        String temp= "";
        UserDetails userDetails = UserDetailsList.get(position);
        holder.id.setText(userDetails.getId());
        holder.name.setText(userDetails.getName());
        holder.userName.setText(userDetails.getUsername());
        holder.email.setText(userDetails.getEmail());
        holder.phone.setText(userDetails.getPhone());
        holder.website.setText(userDetails.getWebsite());
        holder.street.setText(userDetails.getAddress().getStreet());
        holder.suite.setText(userDetails.getAddress().getSuite());
        holder.city.setText(userDetails.getAddress().getCity());
        holder.zipcode.setText(userDetails.getAddress().getZipcode());
        holder.lat.setText(userDetails.getAddress().getGeo().getLat());
        holder.lng.setText(userDetails.getAddress().getGeo().getLng());
        holder.companyName.setText(userDetails.getCompany().getName());
        holder.catchPhrase.setText(userDetails.getCompany().getCatchPhrase());
        holder.bs.setText(userDetails.getCompany().getBs());



    }

    @Override
    public int getItemCount() {
        return UserDetailsList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        TextView name,id,userName,email,phone,website,street,suite,city,zipcode,lat,lng,companyName,catchPhrase,bs;
        public UserViewHolder(@NonNull  View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            id = itemView.findViewById(R.id.id);
            userName = itemView.findViewById(R.id.userName);
            email = itemView.findViewById(R.id.email);
            phone = itemView.findViewById(R.id.phone);
            website = itemView.findViewById(R.id.website);
            street = itemView.findViewById(R.id.street);
            suite = itemView.findViewById(R.id.suit);
            city = itemView.findViewById(R.id.city);
            zipcode = itemView.findViewById(R.id.ZipCode);
            lat = itemView.findViewById(R.id.lat);
            lng = itemView.findViewById(R.id.lng);
            companyName = itemView.findViewById(R.id.companyName);
            catchPhrase = itemView.findViewById(R.id.catchPharse);
            bs = itemView.findViewById(R.id.bs);



        }
    }
}

