package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Cities_Activity extends AppCompatActivity {

    private Button Back_button;
    private RecyclerView City_recyclerview;

    Adapter_City adapter_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        City_recyclerview = (RecyclerView) findViewById(R.id.cities_recyclerview_id);
        City_recyclerview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model> options=
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("river"), model.class)
                        .build();

        adapter_city=new Adapter_City(options);
        City_recyclerview.setAdapter(adapter_city);



        Back_button=findViewById(R.id.cities_back_button_id);
        Back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Cities_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        adapter_city.startListening();
    }

    @Override

    protected void onStop(){
        super.onStop();
        adapter_city.stopListening();
    }
}

