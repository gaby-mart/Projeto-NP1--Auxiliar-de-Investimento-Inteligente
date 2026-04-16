package com.example.telaprincipal;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;

import android.widget.Button;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class homeActivity extends AppCompatActivity {

    Button botaoEntrar;

    Button botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botaoEntrar = findViewById(R.id.botaoEntrar);
        botaoCadastrar = findViewById(R.id.botaoCadastrar);

        botaoEntrar.setOnClickListener(v ->{
            Intent intent = new Intent(homeActivity.this, loginActivity.class);
            startActivity(intent);
        });

        botaoCadastrar.setOnClickListener(v ->{
            Intent intent = new Intent(homeActivity.this, cadastroActivity.class);
            startActivity(intent);
        });
    }
}