package com.example.androidproject;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface User {
    @GET("users")
    Call<List<UserDetails>> getUserDetails();
}
