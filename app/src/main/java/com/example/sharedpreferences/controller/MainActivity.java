package com.example.sharedpreferences.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sharedpreferences.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText email, password;
private Button login, signup;
private SharedPreferences sp,lp;
private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.etEmail);
        password= findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        signup = findViewById(R.id.btnSignup);

        //abc is xml file name
        sp = getSharedPreferences("abc", MODE_PRIVATE);
        lp = getSharedPreferences("loginstate", MODE_PRIVATE);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnLogin){
            //TODO: login logic
            String uEmail = email.getText().toString();
            String uPassword = password.getText().toString();
            String fEmail =sp.getString("email","");
            String fPassword = sp.getString("password", "");

            if(formValidation(uEmail, uPassword)){
                if(uEmail.equals(fEmail) && uPassword.equals(fPassword)){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT ).show();

                    SharedPreferences.Editor et = lp.edit();
                    et.putBoolean("state",true);
                    et.apply();

                    startIntent(HomeActivity.class);
                }else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT ).show();
                }
            }

        }else if(v.getId()==R.id.btnSignup){
            startIntent(SignupActivity.class);
        }
    }

    public boolean formValidation(String email, String password){
        boolean valid = true;
        //empty input
        if(TextUtils.isEmpty(email)){
            valid = false;
            this.email.setError("Email can't be true");
        }

        if(TextUtils.isEmpty(password)){
            valid = false;
            this.password.setError("Password can't be true");
        }
        return valid;
    }
    @Override
    protected void onStart() {
        super.onStart();
        checkLoginStatus();
    }
    private void checkLoginStatus(){
        SharedPreferences lp = getSharedPreferences("loginstate", MODE_PRIVATE);
        boolean value= lp.getBoolean("state",false);
        if(value){
            startIntent(HomeActivity.class);
        }
    }
    private void startIntent(Class activity){
        i = new Intent(MainActivity.this, activity);
        startActivity(i);
    }
}