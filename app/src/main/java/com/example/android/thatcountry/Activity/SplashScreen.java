package com.example.android.thatcountry.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.example.android.thatcountry.Api.ApiClient;
import com.example.android.thatcountry.Api.ApiInterface;
import com.example.android.thatcountry.Models.Country;
import com.example.android.thatcountry.R;

import java.io.Serializable;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call apiResponse = apiService.getAllCountries();

        apiResponse.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                List<Country> countriesList = response.body();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("countries", (Serializable) countriesList);
                intent.putExtra("bundle", bundle);
                startActivity(intent);

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    protected void onPause() {
        super.onPause();
        finish();
    }
}
