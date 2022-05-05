package com.example.sharedpreferences.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.sharedpreferences.R;

public class SignupActivity extends AppCompatActivity {
EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

    }
    public void register_click(View v){
//        todo: signup logic
//        todo: extract user input

        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

//        todo: form validation
        if(formValidation(email, password)){
            SharedPreferences sp =getSharedPreferences("abc",MODE_PRIVATE);
            SharedPreferences.Editor et = sp.edit();
            et.putString("email",email);
            et.putString("password",password);
            et.apply();

            Intent iSignIn = new Intent(SignupActivity.this, MainActivity.class);
            startActivity(iSignIn);
        }

    }
    public boolean formValidation(String email, String password){
        boolean valid = true;
        //empty input
        if(TextUtils.isEmpty(email)){
            valid = false;
            etEmail.setError("Email can't be true");
        }

        if(TextUtils.isEmpty(password)){
            valid = false;
            etPassword.setError("Password can't be true");
        }
        return valid;
    }
}