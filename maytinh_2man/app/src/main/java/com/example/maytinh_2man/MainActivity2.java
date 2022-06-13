package com.example.maytinh_2man;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btncong,btntru,btnnhan,btnchia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btncong = (Button) findViewById(R.id.btnCong);
        btntru = (Button) findViewById(R.id.btnTru);
        btnnhan = (Button) findViewById(R.id.btnNhan);
        btnchia = (Button) findViewById(R.id.btnChia);
        // code
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}