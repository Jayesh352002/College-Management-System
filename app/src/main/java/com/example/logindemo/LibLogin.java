package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LibLogin extends Activity {
    Button L;
    EditText t1, t2;
    String [] lib = {"JayBafna","KumarPatel"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_login);
        L = findViewById(R.id.b3);
        t1 = findViewById(R.id.edit);
        t2 = findViewById(R.id.edit1);
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = new String();
                String s2 = new String();
                s1 = t1.getText().toString();
                s2 = t2.getText().toString();
                if (s1.isEmpty() != true && s2.isEmpty() != true)
                {
                    for(int i = 0; i<lib.length ; i++) {
                        if (lib[i].equals(s1)) {
                            Toast.makeText(LibLogin.this, "Attendance Completed", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LibLogin.this,Lib.class);
                            startActivity(intent);
                            break;
                        }
                        else
                        {
                            Toast.makeText(LibLogin.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                        }
                    }


                }
                else {
                    Toast.makeText(LibLogin.this, "Please Enter Login Details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}