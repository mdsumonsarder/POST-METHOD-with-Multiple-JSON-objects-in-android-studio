package com.example.postmethodwithmultiplejsonobjects.Response;

import com.example.postmethodwithmultiplejsonobjects.MainObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OurRetrofitClient {

    @POST("q")
    Call<MainResponseObjectClass> GetPostValue(@Body MainObject mainObject);
}
