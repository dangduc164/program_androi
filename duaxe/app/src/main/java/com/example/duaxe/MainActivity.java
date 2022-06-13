package com.example.duaxe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton play;
    SeekBar s1,s2,s3;
    CheckBox c1,c2,c3;
    TextView t1;
    int ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gan ket qua la 100
        ketqua= 100;

        anhxa();

        checkbox();

        //su dung coutDownTimer de goi su kien tick (moi giay thi seek se thay doi gia tri - Progress)
        CountDownTimer dongho = new CountDownTimer(60000,500) {
            @Override
            public void onTick(long l) {

                // Moi lan tick thay doi gia tri seekbar-Progress
                Random r = new Random();
                int rs1=r.nextInt(8) + 2;
                int rs2=r.nextInt(8) + 2;
                int rs3=r.nextInt(8) + 2;

                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);

                if(s1.getProgress() == 100){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"S1 Thắng!",Toast.LENGTH_SHORT).show();
                    if (c1.isChecked()){
                        ketqua= ketqua+10;
                    }else {
                        ketqua = ketqua-5;
                    }
                    //gan lai diem cho textview
                    t1.setText(ketqua+"");
                    c1.setEnabled(true);
                    c2.setEnabled(true);
                    c3.setEnabled(true);
                }
                else if(s2.getProgress()==100){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"S2 Thắng!",Toast.LENGTH_SHORT).show();
                    if (c2.isChecked()){
                        ketqua= ketqua+10;
                    }else {
                        ketqua = ketqua-5;
                    }
                    //gan lai diem cho textview
                    t1.setText(ketqua+"");
                    c1.setEnabled(true);
                    c2.setEnabled(true);
                    c3.setEnabled(true);
                }
                else if(s3.getProgress()==100){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"S3 Thắng!",Toast.LENGTH_SHORT).show();
                    if (c3.isChecked()){
                        ketqua= ketqua+10;
                    }else {
                        ketqua = ketqua-5;
                    }
                    //gan lai diem cho textview
                    t1.setText(ketqua+"");
                    c1.setEnabled(true);
                    c2.setEnabled(true);
                    c3.setEnabled(true);
                }else {
                    s1.setProgress(s1.getProgress() + rs1);
                    s2.setProgress(s1.getProgress() + rs2);
                    s3.setProgress(s1.getProgress() + rs3);
                }
            }

            @Override
            public void onFinish() {

            }
        };
        // viet su kien khi nguoi dung nhan chuot vao nut play se bat dau chay dong ho
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()|| c2.isChecked()|| c3.isChecked()){
                    s1.setProgress(0);
                    s2.setProgress(0);
                    s3.setProgress(0);
                    dongho.start();

                } else {
                    Toast.makeText(MainActivity.this,"Vui lòng đặt cược",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    protected void  anhxa(){
        play = (ImageButton) findViewById(R.id.imageButton);
        s1 = (SeekBar) findViewById(R.id.s1);
        s2 = (SeekBar) findViewById(R.id.s2);
        s3 = (SeekBar) findViewById(R.id.s3);
        c1= (CheckBox) findViewById(R.id.c1);
        c2= (CheckBox) findViewById(R.id.c2);
        c3= (CheckBox) findViewById(R.id.c3);
        t1 = (TextView) findViewById(R.id.tv1);
    }

    protected  void  checkbox(){
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    c2.setChecked(false);
                    c3.setChecked(false);
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    c1.setChecked(false);
                    c3.setChecked(false);
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    c2.setChecked(false);
                    c1.setChecked(false);
                }
            }
        });

    }
}