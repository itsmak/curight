package com.innovellent.curight.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.innovellent.curight.R;


public class CustomSpinnerAdapter2 extends BaseAdapter {
    Context context;
    LayoutInflater inflter;
    private String[] spinner2;

    public CustomSpinnerAdapter2(Context context, String[] spinner2) {
        this.context = context;
        this.spinner2 = spinner2;
        inflter = (LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return spinner2.length;
    }

    @Override
    public Object getItem(int i) {
        return spinner2[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_item1, null);
        TextView names = (TextView) view.findViewById(R.id.textview);
        names.setText(spinner2[i]);
        return view;
    }
}
