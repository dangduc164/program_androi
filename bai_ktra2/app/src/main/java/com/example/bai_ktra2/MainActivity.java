package com.example.bai_ktra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //khai báo
    TextView txtname,txtcomment;
    Button btnsubmit;
    EditText editName,editComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        txtname = (TextView) findViewById(R.id.txtName);
        txtcomment = (TextView) findViewById(R.id.txtComment);
        btnsubmit = (Button) findViewById(R.id.btnSubmit);
        editName = (EditText) findViewById(R.id.editName);
        editComment = (EditText) findViewById(R.id.editComment);

        // code nut btn

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editName.length()==0){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập Name", Toast.LENGTH_SHORT).show();
                }
                else if(editComment.length()==0){
                    Toast.makeText(MainActivity.this, "Bạn chưa Comment", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,manktra2.class);
                    String name = editName.getText().toString();
                    String comment = editComment.getText().toString();
                    intent.putExtra("name",name);
                    intent.putExtra("comment",comment);
                    startActivity(intent);
                }


            }
        });
    }
}