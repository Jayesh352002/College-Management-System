package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Welcome1 extends Activity {
    Button h , h1 , h2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome1);
        h = findViewById(R.id.b1);
        h1 = findViewById(R.id.btn2);
        h2 = findViewById(R.id.b3);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Welcome1.this, Home.class);
                startActivity(x);
            }
        });
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x1 = new Intent(Welcome1.this, Event.class);
                startActivity(x1);
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x1 = new Intent(Welcome1.this, Ciriculam.class);
                startActivity(x1);
            }
        });



    }
}
