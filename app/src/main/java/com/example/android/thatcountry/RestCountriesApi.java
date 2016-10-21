package com.example.android.thatcountry;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Makes the calls to the Rest Countries API.
 * If the name of a country is sent, the task will look for a specific country, else it
 * will look for every country.
 */

public class RestCountriesApi extends AsyncTask<String, Void, JSONArray>{

    private final String GET_ALL_COUNTRIES = "https://restcountries.eu/rest/v1/all";
    private final String GET_BY_NAME = "https://restcountries.eu/rest/v1/name/";

    @Override
    protected JSONArray doInBackground(String... strings) {

        URL url;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStreamReader reader;
        String JSONString = "";
        JSONArray resultingJSON;

        try {
            if (strings.length == 0) {
                url = new URL(GET_ALL_COUNTRIES);
            } else {
                url = new URL(GET_BY_NAME + strings[0]);
            }
            httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.connect();

            inputStream = httpURLConnection.getInputStream();
            reader = new InputStreamReader(inputStream);

            int data = reader.read();

            while (data != -1) {
                JSONString += (char)data;
                data = reader.read();
            }
            Log.i("String", JSONString);
            resultingJSON = new JSONArray(JSONString);

            return resultingJSON;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
