package com.example.finalyearproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Adapter_Lake extends FirebaseRecyclerAdapter<lakemodel,Adapter_Lake.Lakeviewholder> {
    public Adapter_Lake(@NonNull FirebaseRecyclerOptions<lakemodel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull Lakeviewholder lakeviewholder, int i, @NonNull lakemodel lakemodel) {

        lakeviewholder.place_txt.setText(("place:- ")+lakemodel.getLake());
        lakeviewholder.lake_txt.setText(("lake name:- ")+lakemodel.getLake());
        lakeviewholder.phval_txt.setText(("PH value:- ")+lakemodel.getPhval());
        lakeviewholder.turbidityval_txt.setText(("Turbidity value:- ")+lakemodel.getTurbidityval());
        lakeviewholder.pollutionval_txt.setText(("Pollution value")+lakemodel.getPollutionval());
    }

    @NonNull
    @Override
    public Lakeviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lake_single_row,parent,false);

        return new Lakeviewholder(view);
    }

    class Lakeviewholder extends RecyclerView.ViewHolder
    {
        TextView place_txt,lake_txt,phval_txt,turbidityval_txt,pollutionval_txt;
        public Lakeviewholder(@NonNull View itemView) {
            super(itemView);

            place_txt=(TextView) itemView.findViewById(R.id.place_text_id);
            lake_txt=(TextView) itemView.findViewById(R.id.lake_text_id);
            phval_txt=(TextView) itemView.findViewById(R.id.phval_text_id);
            turbidityval_txt=(TextView) itemView.findViewById(R.id.turbidityval_text_id);
            pollutionval_txt=(TextView) itemView.findViewById(R.id.pollutionval_text_id);

        }
    }
}
