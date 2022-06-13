package com.example.gametinhnhah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView so1,so2,kq,kq1,kq2,kq3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        kq = (TextView) findViewById(R.id.txtNumber1);
        so2 = (TextView) findViewById(R.id.txtNumber2);
        CountDownTimer time = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long l) {

                Random s1 = new Random();
                Integer number1 = s1.nextInt((9)+1);
                Integer number2 = s1.nextInt((9)+1);
                Integer number3 = s1.nextInt((9)+1);
                Integer number4 = s1.nextInt((9)+1);
                Integer number5 = s1.nextInt((9)+1);
                String chuoi1 = so1.getText().toString();
                int so1 =Integer.parseInt(chuoi1);
                int tong = so1 + number1;
                kq.setText(String.valueOf(tong));

            }

            @Override
            public void onFinish() {

            }
        };
        time.start();


    }
}