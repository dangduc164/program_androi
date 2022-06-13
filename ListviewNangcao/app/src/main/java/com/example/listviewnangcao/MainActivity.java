package com.example.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listviewMonan;
    ArrayList<MonAn> arrayList;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        adapter = new MonAnAdapter(R.layout.listview,arrayList,this);
        listviewMonan.setAdapter(adapter);
    }

    private void anhxa(){
        listviewMonan = (ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("Bò hầm" , "bò hầm thịt lơn :)" , "2000", R.drawable.boham));
        arrayList.add(new MonAn("sushi" , "sushi có rô" , "1000", R.drawable.sushi));
        arrayList.add(new MonAn("trứng" , "trứng luộc" , "3000", R.drawable.trung));
        arrayList.add(new MonAn("măng" , "tre già măng mọc" , "4000", R.drawable.mang));
        arrayList.add(new MonAn("cháo" , "cháo trắng" , "200000", R.drawable.chao));
    }
}