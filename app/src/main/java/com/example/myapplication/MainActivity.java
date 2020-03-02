package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;
    Button btnRegister;


    final String USERNAME = "user";
    final String PASSWORD = "password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPassword = findViewById(R.id.txt_password);
        txtUsername = findViewById(R.id.txt_username);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if(username == USERNAME && password == PASSWORD) {
                    Toast.makeText(MainActivity.this, "Login Success!",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Fail!",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
