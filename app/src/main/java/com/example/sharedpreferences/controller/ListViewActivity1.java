package com.example.sharedpreferences.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sharedpreferences.view.MyCustomAdapter;
import com.example.sharedpreferences.R;

public class ListViewActivity1 extends AppCompatActivity {
private ListView list;
String[] names = {
        "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
        "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
        "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
        "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
        "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA",
        "RAM","RACHANA","PRAKASH","GITANGALI","URMILA","SARITA"
};
String[] address = {
        "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
        "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
        "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
        "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
        "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT",
        "KATHMANDU", "BHAKTAPUR", "LALITPUR", "MAKWANPUR", "NUWAKOT"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);
        list = findViewById(R.id.list1);

//        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names));
        list.setAdapter(new MyCustomAdapter(this, names, address));

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(ListViewActivity1.this,names[i],Toast.LENGTH_LONG).show();
//            }
//        });
    }

}