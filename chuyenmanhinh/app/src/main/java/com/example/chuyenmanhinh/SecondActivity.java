package com.example.chuyenmanhinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btnClick2;
    TextView txtView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtView1 = (TextView) findViewById(R.id.txtView1);
        btnClick2 = (Button) findViewById(R.id.btnClick2);
        // truyền dữ liệu dạng
////        String hienthi;
////        Intent intent = getIntent();
////        hienthi = intent.getStringExtra("dulieu");
//        // gán lên textview
//        txtView1.setText(hienthi);chuỗi

        //Truyền dữ liệu dạng số
//        Integer hienthi;
//        Intent intent = getIntent();
//        hienthi = intent.getIntExtra("dulieu",1900);
//        txtView1.setText(hienthi.toString());

        //Truyền dữ liệu dạng Array
        String[] hienthi;
        Intent intent = getIntent();
        hienthi = intent.getStringArrayExtra("dulieu");
        txtView1.setText(hienthi.length + hienthi[1]);
        //code
        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}