package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Civil1 extends Activity {
    Button b ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil1);
        b = findViewById(R.id.ab1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Civil1.this, Welcome1 .class);
                startActivity(x);
            }
        });
    }
}
