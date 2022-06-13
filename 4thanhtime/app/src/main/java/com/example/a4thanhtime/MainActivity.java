package com.example.a4thanhtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnstart;
    ProgressBar thanh1;
    ProgressBar thanh2;
    ProgressBar thanh3;
    ProgressBar thanh4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // anh xa
        btnstart = (Button) findViewById(R.id.btnStart);
        thanh1 = (ProgressBar) findViewById(R.id.progressBar);
        thanh2 = (ProgressBar) findViewById(R.id.progressBar2);
        thanh3 = (ProgressBar) findViewById(R.id.progressBar3);
        thanh4 = (ProgressBar) findViewById(R.id.progressBar4);
        // max
        thanh1.setMax(100);
        thanh2.setMax(100);
        thanh3.setMax(100);
        thanh4.setMax(100);
        //code nut btmStart
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer time =new CountDownTimer(20000,1000) {
                    @Override
                    public void onTick(long l) {
                        Random s1 =new Random();
                        Integer number1 =s1.nextInt((9)+1);
                        Integer number2 =s1.nextInt((9)+1);
                        Integer number3 =s1.nextInt((9)+1);
                        Integer number4 =s1.nextInt((9)+1);
                        if(thanh1.getProgress() <= 100 || thanh2.getProgress() <=100 || thanh3.getProgress() <=100 || thanh4.getProgress() <= 100){
                            thanh1.setProgress(0);
                            thanh2.setProgress(0);
                            thanh3.setProgress(0);
                            thanh4.setProgress(0);
                        }else {
                            thanh1.setProgress(thanh1.getProgress() + number1);
                            thanh2.setProgress(thanh2.getProgress()+ number2);
                            thanh3.setProgress(thanh3.getProgress()+ number3);
                            thanh4.setProgress(thanh4.getProgress()+ number4);
                        }
                            Toast.makeText(MainActivity.this, "het tien trinh", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "het time", Toast.LENGTH_SHORT).show();

                    }
                };
                time.start();


            }
        });

    }
}