package com.example.mytnh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {
    Button cong,tru,nhan,chia,clear;
    EditText so1,so2,kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ button
        cong = (Button) findViewById(R.id.btnCong);
        tru = (Button) findViewById(R.id.btnTru);
        nhan = (Button) findViewById(R.id.btnNhan);
        chia = (Button) findViewById(R.id.btnChia);
        clear = (Button) findViewById(R.id.btnXoa);

        // ánh xạ edittext
        so1 = (EditText) findViewById(R.id.editNumber1);
        so2 = (EditText) findViewById(R.id.editNumber2);

        //ánh xạ KQ
        kq = (EditText) findViewById(R.id.editKQ);

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = so1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = so2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int tong = so1 + so2;
                kq.setText(String.valueOf(tong));
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = so1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = so2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int hieu = so1 - so2;
                kq.setText(String.valueOf(hieu));
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = so1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = so2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int tich = so1 * so2;
                kq.setText(String.valueOf(tich));
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = so1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = so2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int thuong = so1 / so2;
                kq.setText(String.valueOf(thuong));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                so1.setText("");
                so2.setText("");
                kq.setText("");
            }
        });


    }
}