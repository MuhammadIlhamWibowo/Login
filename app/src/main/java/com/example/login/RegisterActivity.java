package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button registrasi;
    private EditText nama, email, tempatLahir, tanggalLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nama = findViewById(R.id.register_etNama);
        email = findViewById(R.id.register_etEmail);
        tempatLahir = findViewById(R.id.register_etTempatLahir);
        tanggalLahir = findViewById(R.id.register_etTanggalLahir);
        registrasi = findViewById(R.id.btnRegister);

        doRegister();
    }

    private void doRegister() {
    }
}
