package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.FirebaseDatabase;

public class Readings_Activity extends AppCompatActivity {
    private Button Back_button;
    RecyclerView recyclerView_reading;
    Adapter_Lake adapter_lake;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readings);

        recyclerView_reading=(RecyclerView) findViewById(R.id.Readings_recyclerview_id);
        recyclerView_reading.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<lakemodel> options=
                new FirebaseRecyclerOptions.Builder<lakemodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("lakes"), lakemodel.class)
                        .build();

        adapter_lake=new Adapter_Lake(options);
        recyclerView_reading.setAdapter(adapter_lake);




        Back_button=findViewById(R.id.readings_back_button_id);
        Back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Readings_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    @Override
    protected void onStart(){
        super.onStart();
        adapter_lake.startListening();
    }

    @Override

    protected void onStop(){
        super.onStop();
        adapter_lake.stopListening();
    }
}