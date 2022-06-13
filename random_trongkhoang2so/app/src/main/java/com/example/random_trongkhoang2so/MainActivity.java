package com.example.random_trongkhoang2so;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    Button btnrandom;
    TextView txtkq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        number1 = (EditText) findViewById(R.id.editNumber1);
        number2 = (EditText) findViewById(R.id.editNumber2);
        btnrandom = (Button) findViewById(R.id.btnRandom);
        txtkq = (TextView) findViewById(R.id.txtKQ);
        // lấy dữ liệu
        // code btnRamdom
        btnrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.length() == 0 || number2.length() == 0) {
                    Toast.makeText(MainActivity.this, "bạn hãy nhập số vào", Toast.LENGTH_SHORT).show();
                } else {
                    String chuoi1 = number1.getText().toString();
                    int number1 = Integer.parseInt(chuoi1);
                    String chuoi2 = number2.getText().toString();
                    int number2 = Integer.parseInt(chuoi2);


                    if (number1 > number2) {
                        Toast.makeText(MainActivity.this, "Bạn phải nhập số thứ hai lớn số thứ nhất ", Toast.LENGTH_SHORT).show();
                    } else {
                        Random random = new Random();
                        int kq = random.nextInt((number2 - number1) + 1) + number1;
                        txtkq.setText(String.valueOf(kq));
                    }
                }
            }
        });


    }
}