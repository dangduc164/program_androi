package com.example.chuyenmanhinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnclick1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        btnclick1 = (Button) findViewById(R.id.btnClick1);
        // code khi bấn vaof nút btnClick1 thì chuyển nàm hình
        btnclick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                String[] mangdl = {"iphone","oppo","vivo","samsung"};
//                intent.putExtra("dulieu","Welcome");
//                intent.putExtra("dulieu",2022);
                intent.putExtra("dulieu",mangdl);
                startActivity(intent);
            }
        });
    }
}