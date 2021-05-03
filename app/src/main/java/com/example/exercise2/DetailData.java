package com.example.exercise2;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DetailData extends AppCompatActivity {
    Button btnDelete, btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);

        btnDelete = findViewById(R.id.btndel);
        btnEdit = findViewById(R.id.btned);
    }
}
