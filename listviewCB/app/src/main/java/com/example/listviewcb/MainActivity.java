package com.example.listviewcb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> arlistView;
    String click;
    Button btlthem;
    EditText txtthem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        listView1 = (ListView) findViewById(R.id.listView);
        arlistView = new ArrayList<>();// chính thức tạo ra 1 mảng arraylist.


     // thêm dữ liêu cho array list
        arlistView.add("Lập trình java");
        arlistView.add("Lập trình android");
        arlistView.add("Lập trình IOS");
        arlistView.add("Lập trình .NET");

        // Đổ dữ liệu vào listview
        ArrayAdapter adListview = new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,arlistView);
        listView1.setAdapter(adListview);
        txtthem = (EditText) findViewById(R.id.editText);
        btlthem = (Button) findViewById(R.id.button);
        btlthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noidung;
                noidung = txtthem.getText().toString();// lấy dữ liệu từ edittext.
                arlistView.add(noidung);// thêm dữ liệu vào mảng
                adListview.notifyDataSetChanged();// Gọi hàm thực thi việc thay dổid
            }
        });
        // Gọi sự kiện cho listview itemClick
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                click = click + arlistView.get(i);
                Toast.makeText(MainActivity.this, "Bạn đã chọn:  "+click, Toast.LENGTH_SHORT).show();
            }
        });
        // Gọi sự kiện longclick (Nhấn và giữ lâu vào một lựa chọn trên Listview)
        listView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Bạn vừa nhấm lâu vào: "+ arlistView.get(i), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}