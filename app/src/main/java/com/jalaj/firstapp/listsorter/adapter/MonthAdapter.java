package com.jalaj.firstapp.listsorter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jalaj.firstapp.listsorter.Month;
import com.jalaj.firstapp.listsorter.R;

import java.util.ArrayList;

/**
 * Created by jalajmehta on 7/3/16.
 */
public class MonthAdapter extends BaseAdapter {
    ArrayList<Month> monthList;
    LayoutInflater layoutInflater;

    public MonthAdapter(ArrayList<Month> monthList, Context ctx) {
        this.monthList = monthList;
        layoutInflater = layoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return monthList.size();
    }

    @Override
    public Object getItem(int position) {
        return monthList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.layout_linear_txt_month,parent,false);
        Month month = (Month) getItem(position);
        TextView textView = (TextView)convertView.findViewById(R.id.textView);
        textView.setText(month.getMonthName());
        return convertView;
    }
}
