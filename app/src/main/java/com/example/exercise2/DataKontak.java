package com.example.exercise2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataKontak extends AppCompatActivity {
    TextView eNama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kontak);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        eNama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama) {
            case "Bramantyo":
                eNama.setText("Bramantyo");
                tvnomor.setText("081578902407");
                break;
            case "Narendra":
                eNama.setText("Narendra");
                tvnomor.setText("081367813452");
                break;
            case "Agus":
                eNama.setText("Agus");
                tvnomor.setText("089754168625");
                break;
            case "Andi":
                eNama.setText("Andi");
                tvnomor.setText("082478560987");
                break;
            case "Bagas":
                eNama.setText("Bagas");
                tvnomor.setText("083478650976");
                break;
            case "Bagus":
                eNama.setText("Bagus");
                tvnomor.setText("084578543271");
                break;
            case "Satriya":
                eNama.setText("Satriya");
                tvnomor.setText("086782134578");
                break;
            case "Salman":
                eNama.setText("Salman");
                tvnomor.setText("087234168732");
                break;
            case "Ridho":
                eNama.setText("Ridho");
                tvnomor.setText("088456123054");
                break;
            case "Rayhan":
                eNama.setText("Rayhan");
                tvnomor.setText("089134578901");
                break;
        }
    }
}
