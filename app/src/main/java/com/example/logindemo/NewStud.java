package com.example.logindemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class NewStud extends Activity {
    Spinner s, l;
    Button btn;
    EditText t1, t2, t3, t4, t5, t6, t7, t8, t9;
    RadioButton r1, r2;
    myDbAdapter connectionClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_stud);
        btn = findViewById(R.id.button);
        l = findViewById(R.id.list);
        t1 = findViewById(R.id.editText1);
        t2 = findViewById(R.id.editText2);
        t3 = findViewById(R.id.editText3);
        t4 = findViewById(R.id.editText4);
        t5 = findViewById(R.id.editText5);
        t6 = findViewById(R.id.editText6);
        t7 = findViewById(R.id.editText7);
        t8 = findViewById(R.id.editText8);
        t9 = findViewById(R.id.editText9);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        s = findViewById(R.id.spin);
        connectionClass = new myDbAdapter(this);
        ArrayList<String> arrayList = new ArrayList<>();
        String year[] = {"First", "Second", "Third"};
        arrayList.add("Computer");
        arrayList.add("Electrical");
        arrayList.add("Civil");
        arrayList.add("Mechanical");
        arrayList.add("Automobile");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(arrayAdapter);
        ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, year);
        l.setAdapter(adpt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddStud a = new AddStud();
                a.addstudent(v);
            }
        });
    }

    public class AddStud {
        String s = t1.getText().toString();
        String s1 = t2.getText().toString();
        String s2 = t3.getText().toString();
        String s3 = t4.getText().toString();
        String s4 = t5.getText().toString();
        String s5 = t6.getText().toString();
        String s6 = t7.getText().toString();
        String s7 = t8.getText().toString();
        String s8 = t9.getText().toString();
        String s9 = r1.getText().toString();
        String s10 = r2.getText().toString();
        String str;
        Boolean b;

        public void addstudent(View view) {
            if (s.isEmpty() == true) {
                Toast.makeText(NewStud.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s1.isEmpty() == true) {
                Toast.makeText(NewStud.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s2.isEmpty() == true) {
                Toast.makeText(NewStud.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s3.isEmpty() == true) {
                Toast.makeText(NewStud.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s4.isEmpty() == true) {
                Toast.makeText(NewStud.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s5.isEmpty() == true && s5.length()!=10) {
                Toast.makeText(NewStud.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else if (s6.isEmpty() == true) {
                Toast.makeText(NewStud.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
            } else {
                long id = connectionClass.insertStud(s, s1, s2, s3, s4, s5, s6, s7 , s8 , s9 ,s10 );
                if (id < 0) {
                    Toast.makeText(NewStud.this, "New Student Added Successful", Toast.LENGTH_SHORT).show();
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    r1.setChecked(false);
                    r2.setChecked(false);
                } else {
                    Toast.makeText(NewStud.this, "Insertion Unsuccessful", Toast.LENGTH_SHORT).show();
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    r1.setChecked(false);
                    r2.setChecked(false);
                }
            }


        }
    }

}