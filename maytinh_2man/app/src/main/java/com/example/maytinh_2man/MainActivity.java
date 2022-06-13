package com.example.maytinh_2man;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button choose,result;
    EditText number1,number2;
    TextView txtpheptinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        choose = (Button) findViewById(R.id.btnChoose);
        number1 = (EditText) findViewById(R.id.editNumber1);
        number2 = (EditText) findViewById(R.id.editNumber2);
        // code
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1.length()==0){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập Number1", Toast.LENGTH_SHORT).show();
                }
                else if(number2.length()==0){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập Number2", Toast.LENGTH_SHORT).show();
                }
                else{
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                startActivity(intent);}
            }
        });
    }
}