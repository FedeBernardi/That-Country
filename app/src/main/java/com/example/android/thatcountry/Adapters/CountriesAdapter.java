package com.example.android.thatcountry.Adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.thatcountry.Activity.CountryDetail;
import com.example.android.thatcountry.Models.Country;
import com.example.android.thatcountry.R;

import java.util.List;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.MyViewHolder> {

    private List<Country> countriesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.name = (TextView) itemView.findViewById(R.id.name);
        }
    }

    public CountriesAdapter (List<Country> list) {
        this.countriesList = list;
    }

    public MyViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.country_row, parent, false);

        itemView.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int pos = parent.indexOfChild(v);
                Intent intent = new Intent(v.getContext(), CountryDetail.class);

                intent.putExtra("country", countriesList.get(pos));
                v.getContext().startActivity(intent);
            }

        });

        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        Country country = countriesList.get(position);
        holder.name.setText(country.getName());
    }

    @Override
    public int getItemCount() {
        return countriesList.size();
    }
}
