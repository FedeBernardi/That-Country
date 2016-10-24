package com.example.android.thatcountry.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.thatcountry.Models.Country;
import com.example.android.thatcountry.R;
import com.squareup.picasso.Picasso;

public class CountryDetail extends AppCompatActivity {

    private TextView name, region, capital, population, area;
    private ImageView map;
    private Country country;
    private String mapsUrl = "http://maps.google.com/maps/api/staticmap?center=%lat,%lon&zoom=%z&size=800x800&sensor=false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        String actualMap = "";
        Intent intent = getIntent();
        country = (Country) intent.getSerializableExtra("country");

        this.name = (TextView)findViewById(R.id.name);
        this.region = (TextView) findViewById(R.id.region);
        this.capital = (TextView) findViewById(R.id.capital);
        this.population = (TextView) findViewById(R.id.population);
        this.area = (TextView) findViewById(R.id.area);
        this.map = (ImageView) findViewById(R.id.map);

        this.name.setText(country.getName());
        this.region.setText(country.getRegion());
        this.capital.setText(country.getCapital());
        this.population.setText(Integer.toString(country.getPopulation()));
        this.area.setText(Float.toString(country.getArea()) + " km2");

        actualMap = this.mapsUrl.replace("%lat", Float.toString(country.getLatlng().get(0)));
        actualMap = actualMap.replace("%lon", Float.toString(country.getLatlng().get(1)));
        actualMap = actualMap.replace("%z", Integer.toString(this.getProperZoom()));

        Picasso.with(getApplicationContext()).load(actualMap).into(this.map);
    }

    private int getProperZoom() {
        int zoom = 2;

        if (this.country.getArea() < 3000000  ) { zoom = 4; }
        if (this.country.getArea() < 1500000  ) { zoom = 5; }
        if (this.country.getArea() < 500000  ) { zoom = 7; }
        if (this.country.getArea() < 20000  ) { zoom = 8; }

        return zoom;
    }

}
