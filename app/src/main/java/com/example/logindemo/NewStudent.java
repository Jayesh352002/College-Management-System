package com.example.logindemo;

import android.content.Intent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewStudent extends Activity {
    Button b;
    CheckBox c;
    EditText t1, t2, t3, t4, t5, t6 , t7;
    String [] books={"Java","English","PHP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_student);
        b = findViewById(R.id.button4);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        c = findViewById(R.id.c1);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String s =  new String();
               String s1 = new String();
               String s2 = new String();
               String s3 = new String();
               String s4 = new String();
               String s5 = new String();
               String s6 = new String();
               String s7 = new String();
               s = t1.getText().toString();
               s1 = t2.getText().toString();
               s2 = t3.getText().toString();
               s3 = t4.getText().toString();
               s4 = t5.getText().toString();
               s5 = t6.getText().toString();
               s6 = c.getText().toString();
               s7 = t7.getText().toString();

               if(s.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else if(s1.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else if(s2.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else if(s3.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else if(s4.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else if(s5.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else if(s6.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else if(s7.isEmpty()==true)
               {
                   Toast.makeText(NewStudent.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   int i;
                   for(i = 0; i<books.length ; i++)
                   {
                       if(books[i].equals(s3))
                       {
                           Toast.makeText(NewStudent.this, " "+books[i]+" Book Given To Student", Toast.LENGTH_SHORT).show();
                           t1.setText("");
                           t2.setText("");
                           t3.setText("");
                           t4.setText("");
                           t5.setText("");
                           t6.setText("");
                           t7.setText("");
                           c.setChecked(false);
                           break;
                       }
                       else
                       {
                           Toast.makeText(NewStudent.this, "Book is Not Avialable", Toast.LENGTH_SHORT).show();
                           t1.setText("");
                           t2.setText("");
                           t3.setText("");
                           t4.setText("");
                           t5.setText("");
                           t6.setText("");
                           t7.setText("");
                           c.setChecked(false);
                       }

                   }

               }
           }
       });

    }
}



