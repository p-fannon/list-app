package com.github.pfannon.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GroceryAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] groceries;
    String[] prices;
    String[] descriptions;

    public GroceryAdapter(Context c, String[] g, String[] p, String[] d) {
        groceries = g;
        prices = p;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return groceries.length;
    }

    @Override
    public Object getItem(int position) {
        return groceries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = v.findViewById(R.id.nameTextView);
        TextView priceTextView = v.findViewById(R.id.priceTextView);
        TextView descriptionTextView = v.findViewById(R.id.descriptionTextView);

        String name = groceries[position];
        String cost = prices[position];
        String desc = descriptions[position];

        nameTextView.setText(name);
        priceTextView.setText(cost);
        descriptionTextView.setText(desc);

        return v;
    }
}
