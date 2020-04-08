package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lib extends Activity {
    Button b , c ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        b = findViewById(R.id.btn2);
        c = findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Lib.this, NewStudent.class);
                startActivity(a);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a1 = new Intent(Lib.this, AddBook.class);
                startActivity(a1);
            }
        });

    }
}
