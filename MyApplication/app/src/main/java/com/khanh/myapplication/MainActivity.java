package com.khanh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoTV;
    ArrayList<String> nationString;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nationString.add("VietNam");
        nationString.add("USA");
        nationString.add("Japan");
        nationString.add("China");
        nationString.add("Australia");
        // adapter
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                nationString);
        /// điều khiển Autocompleple
        autoTV = (AutoCompleteTextView) findViewById(R.id.autoQuocGia);
        ///
        autoTV.setAdapter(adapter);
    }
}