package com.example.sharedpreferences.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sharedpreferences.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] names, address;
    public CustomAdapter(Context c, String[] names, String[] address){

        context = c;
        this.names = names;
        this.address = address;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
            return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder viewHolder;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.single_item, null);
            viewHolder= new MyViewHolder();
            viewHolder.tv = convertView.findViewById(R.id.textView);
            viewHolder.tv1 = convertView.findViewById(R.id.textView1);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (MyViewHolder)  convertView.getTag();
        }
        viewHolder.tv.setText(names[position]);
        viewHolder.tv1.setText(address[position]);
        return convertView;
    }
    private class MyViewHolder{
        TextView tv;
        TextView tv1;
    }
}
