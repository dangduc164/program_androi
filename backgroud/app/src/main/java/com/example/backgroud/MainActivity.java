package com.example.backgroud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout cl;
    ArrayList<Integer> dsanhnen;
    Button btnclick;
    ProgressBar thanhTT;
    Button btntime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        btntime = (Button) findViewById(R.id.btnTime);
        thanhTT = (ProgressBar) findViewById(R.id.progressBar2);
        cl = (ConstraintLayout) findViewById(R.id.layout1);
        btnclick = (Button) findViewById(R.id.btnClick);
        dsanhnen = new ArrayList<>();
        // thêm ảnh vào ArrayList
        dsanhnen.add(R.drawable.anh1);
        dsanhnen.add(R.drawable.anh2);
        dsanhnen.add(R.drawable.anh3);
        dsanhnen.add(R.drawable.anh4);
        // giá trinh thành tiến trình
        thanhTT.setMax(100);
        //code nut click
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                Integer vitri = r.nextInt(dsanhnen.size());
                cl.setBackgroundResource(dsanhnen.get(vitri));
                // code thanh tiến trình
                if(thanhTT.getProgress() == 100){
                    thanhTT.setProgress(0);
                }else {
                    thanhTT.setProgress(thanhTT.getProgress() + 25);
                }
            }
        });
        // code button time chạy couttimer
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer time1 = new CountDownTimer(10000,1000) {
                    @Override
                    public void onTick(long l) {
                        // mỗi 1s công thêm 10 vào process là +10
                        thanhTT.setProgress(thanhTT.getProgress()+10);
                        if(thanhTT.getProgress() >100){
                            Toast.makeText(MainActivity.this, "Hết tiến trình", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "Hết thời gian", Toast.LENGTH_SHORT).show();
                    }
                };
                time1.start();
            }
        });
    }
}