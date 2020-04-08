package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Login extends Activity {
    Button L ;
    RadioGroup rg;
    RadioButton r1,r2,r3,r4,r5;
    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        L = findViewById(R.id.b3);
        rg=findViewById(R.id.radioGroup);
        r1=(RadioButton)findViewById(R.id.comp);
        r2=(RadioButton)findViewById(R.id.ci);
        r3=(RadioButton)findViewById(R.id.auto);
        r4=(RadioButton)findViewById(R.id.mech);
        r5=(RadioButton)findViewById(R.id.elec);
        t1 = findViewById(R.id.edit);
        t2 = findViewById(R.id.edit1);
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = new String();
                String s2 = new String();
                s1 = t1.getText().toString();
                s2 = t2.getText().toString();
                if(s1.isEmpty()!=true && s2.isEmpty()!=true) {

                    if(s1.equals(s2)) {
                        Toast.makeText(Login.this, "Attendance Completed", Toast.LENGTH_SHORT).show();
                        if (r1 == null || r2 != null || r3 != null || r4 != null || r5 != null) {
                            Intent x = new Intent(Login.this, Computer1.class);
                            startActivity(x);
                        } else if (r1 != null || r2 == null || r3 != null || r4 != null || r5 != null) {
                            Intent x = new Intent(Login.this, Civil1.class);
                            startActivity(x);
                        } else if (r1 != null || r2 != null || r3 == null || r4 != null || r5 != null) {
                            Intent x = new Intent(Login.this, Auto1.class);
                            startActivity(x);
                        } else if (r1 != null || r2 != null || r3 != null || r4 == null || r5 != null) {
                            Intent x = new Intent(Login.this, Mech1.class);
                            startActivity(x);
                        } else if (r1 != null || r2 != null || r3 != null || r4 != null || r5 == null) {
                            Intent x = new Intent(Login.this, Elec1.class);
                            startActivity(x);
                        }
                    }
                    else
                    {
                        Toast.makeText(Login.this, "Student Cannot Find", Toast.LENGTH_SHORT).show();
                    }
                    if (r1 != null || r2 != null || r3 != null || r4 != null || r5 != null) {
                        Toast.makeText(Login.this, "Please Select Branch", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(Login.this, "Please Enter Login Details", Toast.LENGTH_SHORT).show();
                }
            }
        });


        /*
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int rid = rg.getCheckedRadioButtonId();
                if(R.id.comp==rid){
                    L.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent x = new Intent(Login.this, Computer1.class);
                            startActivity(x);
                        }
                    });
            }else if(R.id.ci==rid){
                    L.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent x = new Intent(Login.this, Civil1.class);
                            startActivity(x);
                        }
                    });
            }else if(R.id.auto==rid){
                    L.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent x = new Intent(Login.this, Auto1.class);
                            startActivity(x);
                        }
                    });
            }else if(R.id.mech==rid){
                    L.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent x = new Intent(Login.this, Mech1.class);
                            startActivity(x);
                        }
                    });
            }else if(R.id.elec==rid){
                    L.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent x = new Intent(Login.this, Elec1.class);
                            startActivity(x);
                        }
                    });
            }
        }});


       */

    }
}
