package com.jalaj.firstapp.listsorter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.jalaj.firstapp.listsorter.adapter.MonthAdapter;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bAscending, bDescending;
    ArrayList<Month> monthList;
    ListView monthListView;
    public static String order="A";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linear);
        //
        bAscending = (Button)findViewById(R.id.bSortAsc);
        bDescending = (Button)findViewById(R.id.bSortDesc);
        bAscending.setOnClickListener(this);
        bDescending.setOnClickListener(this);
        monthListView = (ListView)findViewById(R.id.listMonth);
        //
        monthList = new ArrayList<>();
        monthList.add(new Month("January"));
        monthList.add(new Month("February"));
        monthList.add(new Month("March"));
        monthList.add(new Month("April"));
        monthList.add(new Month("May"));
        monthList.add(new Month("June"));
        monthList.add(new Month("July"));
        monthList.add(new Month("August"));
        monthList.add(new Month("September"));
        monthList.add(new Month("October"));
        monthList.add(new Month("November"));
        monthList.add(new Month("December"));
        //
        MonthAdapter monthAdapter = new MonthAdapter(monthList,this);
        monthListView.setAdapter(monthAdapter);


    }

    @Override
    public void onClick(View v) {

        if (bDescending == (Button) v.findViewById(R.id.bSortDesc)) {

            order = "D";

        }
        else order = "A";
        Collections.sort(monthList);
        MonthAdapter monthAdapter = new MonthAdapter(monthList, this);
        monthListView.setAdapter(monthAdapter);

    }
}
