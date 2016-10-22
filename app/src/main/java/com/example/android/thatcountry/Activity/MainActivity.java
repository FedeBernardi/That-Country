package com.example.android.thatcountry.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

import com.example.android.thatcountry.Models.Country;
import com.example.android.thatcountry.R;
import com.example.android.thatcountry.Api.ApiClient;
import com.example.android.thatcountry.Api.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call apiResponse = apiService.getAllCountries();

        apiResponse.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {

                List<Country> countriesList = response.body();
                Log.i("Countries", Integer.toString(countriesList.size()));

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}
