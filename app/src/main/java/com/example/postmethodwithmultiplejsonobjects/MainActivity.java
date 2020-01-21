package com.example.postmethodwithmultiplejsonobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.postmethodwithmultiplejsonobjects.Response.MainResponseObjectClass;
import com.example.postmethodwithmultiplejsonobjects.Response.OurRetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    LastLoginObject lastLoginObject;
    DataObjectClass dataObjectClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Retrofit Create;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://app.fakejson.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Object Create;
        lastLoginObject = new LastLoginObject("Fri Feb 20 07:01:52 UTC 2009","165.149.219.254");
        dataObjectClass = new DataObjectClass("knight-bird","elizabeth@hotmail.com","male","sumon",lastLoginObject);
        MainObject mainObject = new MainObject("FChbsPaVV7jcQD4R-p8q3A",dataObjectClass);



      //OurRetrofitClient class object create;
        OurRetrofitClient ourRetrofitClient = retrofit.create(OurRetrofitClient.class);

          Call<MainResponseObjectClass> res = ourRetrofitClient.GetPostValue(mainObject);
          res.enqueue(new Callback<MainResponseObjectClass>() {
              @Override
              public void onResponse(Call<MainResponseObjectClass> call, Response<MainResponseObjectClass> response) {

                  String email = response.body().getEmail();
                  String name =  response.body().getName();
                  String gender = response.body().getGender();
                  String id = response.body().getId();
                  //String id = response.body().getLast_login();
                  LastLoginObject object = response.body().getLast_login();

                  String time = object.getDate_time();
                  String ip = object.getIp4();

                  Log.d("name",name);
                  Log.d("email",email);
                  Log.d("gender",gender);
                  Log.d("id",id);
                  Log.d("time",time);
                  Log.d("ip",ip);


              }

              @Override
              public void onFailure(Call<MainResponseObjectClass> call, Throwable t) {

                  Log.d("response","fail");
              }
          });








    }
}
