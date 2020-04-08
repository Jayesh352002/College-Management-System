package com.example.logindemo;

import android.content.Context;
import android.os.AsyncTask;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Newstaff extends Activity {
    Button b;
    EditText t1, t2, t3, t4, t5, t6, t7 , t8 ;
    myDbAdapter connectionClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newstaff);
        b = findViewById(R.id.button);
        t1 = findViewById(R.id.editText2);
        t2 = findViewById(R.id.editText3);
        t3 = findViewById(R.id.editText4);
        t4 = findViewById(R.id.editText5);
        t5 = findViewById(R.id.editText7);
        t6 = findViewById(R.id.editText8);
        t7 = findViewById(R.id.editText9);
        t8 = findViewById(R.id.gen);
        connectionClass = new myDbAdapter(this);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddStaff as = new AddStaff();
                as.addstaff(v);

            }
        });

    }

    public class AddStaff {
        String s = t1.getText().toString();
        String s1 = t2.getText().toString();
        String s2 = t3.getText().toString();
        String s3 = t4.getText().toString();
        String s4 = t5.getText().toString();
        String s5 = t6.getText().toString();
        String s6 = t7.getText().toString();
        String s7 = t8.getText().toString();

        String str;
        Boolean b;

        public void addstaff(View view) {
            if (s.isEmpty() == true) {
                Toast.makeText(Newstaff.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s1.isEmpty() == true && s1.length()!=10) {
                Toast.makeText(Newstaff.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s2.isEmpty() == true) {
                Toast.makeText(Newstaff.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s3.isEmpty() == true) {
                Toast.makeText(Newstaff.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s4.isEmpty() == true) {
                Toast.makeText(Newstaff.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s5.isEmpty() == true) {
                Toast.makeText(Newstaff.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s6.isEmpty() == true) {
                Toast.makeText(Newstaff.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else {
                long id = connectionClass.insertData(s,s1,s2,s3,s4,s5,s6,s7);
                if(id<0) {
                    Toast.makeText(Newstaff.this, "New Staff Added  Successful", Toast.LENGTH_SHORT).show();
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                }
                else
                {
                    Toast.makeText(Newstaff.this, "Insertion unsccessful", Toast.LENGTH_SHORT).show();
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                }
            }


        }
    }
}