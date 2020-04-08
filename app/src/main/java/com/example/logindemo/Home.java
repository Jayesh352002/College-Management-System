package com.example.logindemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends Activity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t1 = findViewById(R.id.gpd);
        t2 = findViewById(R.id.home);


    }
}
