package com.example.gamedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // khai báo
    ImageButton btnstart;
    ProgressBar ga;
    ProgressBar bao;
    ProgressBar cao;
    TextView diem;
    CheckBox check;
    CheckBox check1,check2,check3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                // ánh xạ
        btnstart = (ImageButton) findViewById(R.id.batdau);
        ga = (ProgressBar) findViewById(R.id.thanh2);
        bao = (ProgressBar) findViewById(R.id.thanh3);
        cao = (ProgressBar) findViewById(R.id.thanh1);

        check1 = (CheckBox) findViewById(R.id.checkBox);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        // gán max
        cao.setMax(100);
        ga.setMax(100);
        bao.setMax(100);
        // code nút ImageButton
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer time = new CountDownTimer(22000,1000) {
                    @Override
                    public void onTick(long l) {
                        Random s1 = new Random();
                        Integer number1 = s1.nextInt((9)+1);
                        Integer number2 = s1.nextInt((9)+1);
                        Integer number3 = s1.nextInt((9)+1);
                        if (ga.getProgress() == 100 || cao.getProgress() == 100 || bao.getProgress() == 100){
                            ga.setProgress(0);
                            cao.setProgress(0);
                            bao.setProgress(0);
                        }else{
                            cao.setProgress(cao.getProgress()+number1);
                            bao.setProgress(bao.getProgress()+number2);
                            ga.setProgress(ga.getProgress()+number3);
                        }
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "het time", Toast.LENGTH_SHORT).show();

                    }
                };
                time.start();
                check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    }
                });

            }
        });
    }
}