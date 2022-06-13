package com.example.bai_ktra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class manktra2 extends AppCompatActivity {
    // khai báo
    Button btnback;
    TextView txtname,txtcomment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manktra2);
        //ánh xạ
        btnback = (Button) findViewById(R.id.btnBack);
        txtname= (TextView) findViewById(R.id.txtName);
        txtcomment = (TextView) findViewById(R.id.txtComment);

        // truyền dữ liệu
        String htName,htComment;
        Intent intent = getIntent();
        htName = intent.getStringExtra("name");
        htComment = intent.getStringExtra("comment");
        txtname.setText(htName);
        txtcomment.setText(htComment);

        // code

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manktra2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}