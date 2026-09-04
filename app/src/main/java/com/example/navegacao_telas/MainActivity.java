package com.example.navegacao_telas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textCadastro, txtEmail;
    Button btnLogin;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCadastro = findViewById(R.id.txt_cadastro);
        btnLogin = findViewById(R.id.btn_login);
        txtEmail = findViewById(R.id.txt_recebemail);

        email = txtEmail.getText().toString();

        textCadastro.setOnClickListener(v -> {
            Intent intentCadastro = new Intent(MainActivity.this,CadastroActivity.class);
            startActivity(intentCadastro);

        });

        btnLogin.setOnClickListener(v -> {
            Intent intentHome = new Intent(this,HomeActivity.class);
            intentHome.putExtra("EMAIL",email);
            startActivity(intentHome);
        });

    }
}