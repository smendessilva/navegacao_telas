package com.example.navegacao_telas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txtEmail = findViewById(R.id.txt_recebemail);

        String email = getIntent().getStringExtra("EMAIL");
        txtEmail.setText(email);


    }
}