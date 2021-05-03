package com.example.exercise2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Pendaftaran extends AppCompatActivity {
    Button btnCancel, btnRegistrasi;

    EditText enama, eAlamat, edEmail, edPassword, edrePassword;

    String Nama, Alamat, JenisKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        btnCancel = findViewById(R.id.btnCancel);
        btnRegistrasi = findViewById(R.id.btnRegistrasi);
    }
}
