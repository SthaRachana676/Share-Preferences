package com.example.sharedpreferences.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sharedpreferences.view.CustomAdapter;
import com.example.sharedpreferences.R;
import com.example.sharedpreferences.model.DataModel;

public class ListViewActivity2 extends AppCompatActivity {
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        list = findViewById(R.id.list);
        DataModel d =new DataModel();
        String[] names = d.getNames();
        String[] address = d.getAddress();

//        list.setAdapter(new CustomAdapter(this, names, address));
        list.setAdapter(new CustomAdapter(ListViewActivity2.this, names, address));
    }
}