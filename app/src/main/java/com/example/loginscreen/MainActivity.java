package com.example.loginscreen;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login,reg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginButton);
        reg = findViewById(R.id.regButton);

        login.setOnClickListener(v -> {

            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                Toast.makeText(this, "Bienvenido !!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Inicio de Sesión Invalido !!", Toast.LENGTH_SHORT).show();
            }
        });
        reg.setOnClickListener(v -> {
            setContentView(R.layout.registration_screen);
        });
    }
}