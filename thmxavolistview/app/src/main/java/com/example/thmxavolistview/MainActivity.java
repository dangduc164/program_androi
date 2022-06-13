package com.example.thmxavolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // khai báo biến
    Button btnThem,btnCapnhat;
    EditText editText;
    ListView listView;
    ArrayList arlistview,layListview;
    Integer vitri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ.
        listView = (ListView) findViewById(R.id.listView);
        arlistview = new ArrayList<>();
        ArrayAdapter adListview =new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,arlistview);
        listView.setAdapter(adListview);
        editText= (EditText) findViewById(R.id.editText);
        btnThem = (Button) findViewById(R.id.btnThem);
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dulieu;
                dulieu = editText.getText().toString();
                arlistview.add(dulieu);
                listView.deferNotifyDataSetChanged();
            }
        });
        btnCapnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}