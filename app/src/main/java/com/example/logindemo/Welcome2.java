package com.example.logindemo;

import android.content.Intent;
import android.os.AsyncTask;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Welcome2 extends Activity {
    Button h,h1,h2 ;
    myDbAdapter helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
        h = findViewById(R.id.b3);
        h1 = findViewById(R.id.b1);
        h2 = findViewById(R.id.b4);


        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c1 = new Intent(Welcome2.this, NewStud.class);
                startActivity(c1);
            }
        });

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(Welcome2.this, Home.class);
                startActivity(y);
            }
        });


        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(Welcome2.this, Newstaff.class);
                startActivity(z);
            }
        });

    }


    /*
    public class Student extends AsyncTask<String,String,String>
    {
        String str ;
        Boolean b ;
        @Override
        protected String doInBackground(String... strings) {
                try {
                    Connection c = connectionClass.conn();
                    if (c == null) {
                        str = "Please Check Connection";
                    } else {
                        String query = "select * from allstudent";
                        Statement stmt = c.createStatement();
                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                            Toast.makeText(Welcome2.this, ""+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3), Toast.LENGTH_LONG).show();
                        }
                        str = "Student Details ";
                        b = true;
                    }
                    return null;
                } catch (Exception e) {
                    b = false;
                    str = "Exception " + e;
                }
                return str;
            }
        }
*/
    }

