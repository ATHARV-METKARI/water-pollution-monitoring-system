package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalyearproject.R.id;
import com.github.barteksc.pdfviewer.PDFView;

public class Document_Activity extends AppCompatActivity {

    private Button Back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);

        PDFView pdfView =findViewById(R.id.document_pdf_id);
        pdfView.fromAsset("paper_final.pdf").load();

        Back_Button=findViewById(id.doc_back_button_id);
        Back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Document_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}