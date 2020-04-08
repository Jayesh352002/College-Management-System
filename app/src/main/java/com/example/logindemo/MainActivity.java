package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button Stud;
    Button Teacher;
    Button Lib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stud = findViewById(R.id.b1);
        Teacher = findViewById(R.id.btn2);
        Lib = findViewById(R.id.b3);
        Teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Branch.class);
                startActivity(a);
            }
        });
        Stud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arr = new Intent(MainActivity.this, Login1.class);
                startActivity(arr);
            }
        });
        Lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a1 = new Intent(MainActivity.this, LibLogin.class);
                startActivity(a1);
            }
        });

    }
}