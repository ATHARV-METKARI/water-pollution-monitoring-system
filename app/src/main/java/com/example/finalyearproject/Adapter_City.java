package com.example.finalyearproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Adapter_City extends FirebaseRecyclerAdapter <model,Adapter_City.City_viewholder>{

    public Adapter_City(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull City_viewholder cityViewholder, int i, @NonNull model modelCity)
    {
        cityViewholder.city_txt.setText(modelCity.getCity().toUpperCase());
        cityViewholder.river_txt.setText(("River Name:- ")+modelCity.getName().toUpperCase());
        cityViewholder.ph_txt.setText("PH Value:- "+modelCity.getPh());
        cityViewholder.turbidity_txt.setText("Turbidity:- "+modelCity.getTurbidity());
        cityViewholder.pollution_txt.setText("Pollution:- "+modelCity.getPollution());
    }

    @NonNull
    @Override
    public City_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_layout,parent,false);

        return new City_viewholder(view);
    }

    class City_viewholder extends RecyclerView.ViewHolder{

        TextView city_txt,river_txt,ph_txt,turbidity_txt,pollution_txt;

        public City_viewholder(@NonNull View itemView) {

            super(itemView);

            city_txt=(TextView) itemView.findViewById(R.id.city_text_id);
            river_txt=(TextView) itemView.findViewById(R.id.river_text_id);
            ph_txt=(TextView) itemView.findViewById(R.id.ph_text_id);
            turbidity_txt=(TextView) itemView.findViewById(R.id.turbidity_text_id);
            pollution_txt=(TextView) itemView.findViewById(R.id.pollution_text_id);

        }
    }


}
