package com.example.android.thatcountry.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;

import com.example.android.thatcountry.Adapters.CountriesAdapter;
import com.example.android.thatcountry.Models.Country;
import com.example.android.thatcountry.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Country> countriesList;
    private RecyclerView recyclerView;
    private CountriesAdapter cAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        countriesList = (List<Country>) bundle.getSerializable("countries");

        recyclerView = (RecyclerView)findViewById(R.id.recycler_countries);

        cAdapter = new CountriesAdapter(countriesList);
        RecyclerView.LayoutManager cLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(cLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cAdapter);

    }
}
