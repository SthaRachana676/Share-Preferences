package com.example.sharedpreferences.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.sharedpreferences.R;
import com.example.sharedpreferences.model.DataModel;
import com.example.sharedpreferences.view.CustomAdapter;

public class GridViewActivity extends AppCompatActivity {
private GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        grid = findViewById(R.id.gridview);

        DataModel d =new DataModel();
        String[] names = d.getNames();
        String[] address = d.getAddress();

        grid.setAdapter(new CustomAdapter(GridViewActivity.this,names,address));
    }
}