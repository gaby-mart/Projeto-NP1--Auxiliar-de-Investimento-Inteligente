package com.example.telaprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class cadastroActivity extends AppCompatActivity {

    EditText senha, email, nomeUsuario;

    Button botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);

        senha = findViewById(R.id.senha);
        email = findViewById(R.id.email);
        nomeUsuario = findViewById(R.id.nomeUsuario);
        botaoCadastrar = findViewById(R.id.botaoCadastro);

        botaoCadastrar.setOnClickListener(v -> {

            if (nomeUsuario.getText().toString().isEmpty()) {
                nomeUsuario.setError("Digite a seu nome de usuário.");
                return;
            }
            if (email.getText().toString().isEmpty()) {
                email.setError("Digite o seu email.");
                return;
            }
            if (senha.getText().toString().isEmpty()) {
                senha.setError("Digite o sua senha.");
                return;
            }
            else{
                Intent intent = new Intent(cadastroActivity.this, homeActivity.class);
                startActivity(intent);
            }
        });
    }
}