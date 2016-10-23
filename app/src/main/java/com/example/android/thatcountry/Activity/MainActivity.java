package com.example.android.thatcountry.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import com.example.android.thatcountry.Models.Country;
import com.example.android.thatcountry.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        List<Country> countriesList = (List<Country>) bundle.getSerializable("countries");

        Log.i("Countries", Integer.toString(countriesList.size()));

    }
}
