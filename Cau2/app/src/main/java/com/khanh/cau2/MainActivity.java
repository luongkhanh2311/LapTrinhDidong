package com.khanh.cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBAITHO;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBAITHO =(ListView) findViewById(R.id.lvBAITHO);
        arrayCourse =new ArrayList<>();
        arrayCourse.add("Việt Nam Quê Hương Ta");
        arrayCourse.add("Quê Hương");
        arrayCourse.add("Đất Nước");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayCourse);

        lvBAITHO.setAdapter(adapter);
    }
}