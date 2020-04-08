package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login1 extends Activity {
    Button L ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        L = findViewById(R.id.b1);
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Login1.this, Login.class);
                startActivity(x);
            }
        });
    }
}
