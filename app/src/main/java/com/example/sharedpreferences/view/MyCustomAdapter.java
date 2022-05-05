package com.example.sharedpreferences.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.sharedpreferences.R;

public class MyCustomAdapter extends ArrayAdapter {
    Context c;
    String[] data, addr;
    public MyCustomAdapter(Context listViewActivity1, String[] names, String[] address){
        super(listViewActivity1,0,names);
        c=listViewActivity1;
        data=names;
        addr = address;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(c).inflate(R.layout.single_item, null);
        TextView tv = convertView.findViewById(R.id.textView);
        TextView tv1 = convertView.findViewById(R.id.textView1);
        tv.setText(data[position]);
        tv1.setText(addr[position]);
        convertView.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c,addr[position],Toast.LENGTH_LONG).show();
            }
        });
        return convertView;
    }
}
