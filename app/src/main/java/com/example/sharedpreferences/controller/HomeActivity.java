package com.example.sharedpreferences.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.sharedpreferences.R;

public class HomeActivity extends AppCompatActivity {
private Button btn1, btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 = findViewById(R.id.btnArrayAdapter);
        btn2 = findViewById(R.id.btnBaseAdapter);
        btn3 = findViewById(R.id.btnGridView);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(HomeActivity.this,GridViewActivity.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ListViewActivity2.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ListViewActivity1.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menuLogout){
            SharedPreferences sp = getSharedPreferences("loginstate", MODE_PRIVATE);
            SharedPreferences.Editor et = sp.edit();
            et.remove("state");
            et.apply();
            Intent iLogout = new Intent(HomeActivity.this, MainActivity.class );
            startActivity(iLogout);
        }
        return true;
    }
}