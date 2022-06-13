package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class dua3 extends AppCompatActivity {
    ImageButton imgbtnback;
    ImageButton play;
    TextView txtdiem;
    SeekBar thanh1,thanh2,thanh3;
    CheckBox check1, check2, check3;
    int ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua3);
        //gan ket qua la 100
        ketqua= 100;
        anhxa();
        checkbox();
        imgbtnback = (ImageButton) findViewById(R.id.imgbtnBack);

        // code nút back
        imgbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dua3.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //su dung coutDownTimer de goi su kien tick (moi giay thi seek se thay doi gia tri - Progress)
        CountDownTimer dongho = new CountDownTimer(60000,500) {
            @Override
            public void onTick(long l) {

                // Moi lan tick thay doi gia tri seekbar-Progress
                Random r = new Random();
                int random1 = r.nextInt(8) + 2;
                int random2 = r.nextInt(8) + 2;
                int random3 = r.nextInt(8) + 2;

                check1.setEnabled(false);
                check2.setEnabled(false);
                check3.setEnabled(false);

                if(thanh1.getProgress() == 100){
                    this.cancel();
                    Toast.makeText(dua3.this,"S1 Thắng!",Toast.LENGTH_SHORT).show();
                    if (check1.isChecked()){
                        ketqua= ketqua+10;
                    }else {
                        ketqua = ketqua-10;
                    }
                    //gan lai diem cho textview
                    txtdiem.setText(ketqua+"");
                    check1.setEnabled(true);
                    check2.setEnabled(true);
                    check3.setEnabled(true);
                }
                else if(thanh2.getProgress()==100){
                    this.cancel();
                    Toast.makeText(dua3.this,"S2 Thắng!",Toast.LENGTH_SHORT).show();
                    if (check2.isChecked()){
                        ketqua= ketqua+10;
                    }else {
                        ketqua = ketqua-10;
                    }
                    //gan lai diem cho textview
                    txtdiem.setText(ketqua+"");
                    check1.setEnabled(true);
                    check2.setEnabled(true);
                    check3.setEnabled(true);
                }
                else if(thanh3.getProgress()==100){
                    this.cancel();
                    Toast.makeText(dua3.this,"S3 Thắng!",Toast.LENGTH_SHORT).show();
                    if (check3.isChecked()){
                        ketqua= ketqua+10;
                    }else {
                        ketqua = ketqua-10;
                    }
                    //gan lai diem cho textview
                    txtdiem.setText(ketqua+"");
                    check1.setEnabled(true);
                    check2.setEnabled(true);
                    check3.setEnabled(true);
                }else {
                    thanh1.setProgress(thanh1.getProgress() + random1);
                    thanh2.setProgress(thanh2.getProgress() + random2);
                    thanh3.setProgress(thanh3.getProgress() + random3);
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
                if(check1.isChecked()|| check2.isChecked()|| check3.isChecked()){
                    thanh1.setProgress(0);
                    thanh2.setProgress(0);
                    thanh3.setProgress(0);
                    dongho.start();

                } else {
                    Toast.makeText(dua3.this,"Vui lòng đặt cược",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    protected void  anhxa(){
        play = (ImageButton) findViewById(R.id.batdau);
        thanh1 = (SeekBar) findViewById(R.id.thanh1);
        thanh2 = (SeekBar) findViewById(R.id.thanh2);
        thanh3 = (SeekBar) findViewById(R.id.thanh3);
        check1 = (CheckBox) findViewById(R.id.checkBox);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        txtdiem = (TextView) findViewById(R.id.txtDiem);
    }

    protected  void  checkbox(){
        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    check2.setChecked(false);
                    check3.setChecked(false);
                }
            }
        });
        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    check1.setChecked(false);
                    check3.setChecked(false);
                }
            }
        });
        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    check2.setChecked(false);
                    check1.setChecked(false);
                }
            }
        });

    }
}