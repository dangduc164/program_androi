package com.example.baitaplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        login = (Button) findViewById(R.id.btnLogin);
        user = (EditText) findViewById(R.id.editUser);
        pass = (EditText) findViewById(R.id.editPass);
        //code
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.length() = 0){
                    Toast.makeText( getApplicationContext(),"bạn chưa nhập tào khoản",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}