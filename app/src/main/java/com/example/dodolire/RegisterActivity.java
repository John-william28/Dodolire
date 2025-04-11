package com.example.dodolire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText nomCreche, email, password;
    Button inscriptionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nomCreche = findViewById(R.id.nomCreche);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        inscriptionBtn = findViewById(R.id.inscriptionBtn);

        inscriptionBtn.setOnClickListener(v -> {
            if (nomCreche.getText().toString().isEmpty() || email.getText().toString().isEmpty()
                    || password.getText().toString().isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(new Intent(RegisterActivity.this, FormActivity.class));
            }
        });
    }
}
