package com.example.android.thatcountry.Api;

import com.example.android.thatcountry.Models.Country;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("all")
    Call<List<Country>> getAllCountries();

    @GET("name/{name}")
    Call<List<Country>> getCountryByName(@Path("name") String name);

}
