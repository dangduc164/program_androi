package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btndua2,btndua3,btndua4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        btndua2 = (Button) findViewById(R.id.btnDua2);
        btndua3 = (Button) findViewById(R.id.btnDua3);
        btndua4 = (Button) findViewById(R.id.btnDua4);
        //code chuẩn màn
       btndua2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,dua2.class);
               startActivity(intent);
           }
       });
        btndua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,dua3.class);
                startActivity(intent);
            }
        });
        btndua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,dua4.class);
                startActivity(intent);
            }
        });
    }
}