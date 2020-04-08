package com.example.logindemo;


import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddBook extends Activity {
    EditText b1 , b2 , b3 , b4 ,b5 ;
    Button btn ;
    myDbAdapter connectionClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
        b1 = findViewById(R.id.at2);
        b2 = findViewById(R.id.at3);
        b3 = findViewById(R.id.at4);
        b4 = findViewById(R.id.at5);
        b5 = findViewById(R.id.at6);
        btn = findViewById(R.id.add);
        connectionClass = new myDbAdapter(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Addbook b = new Addbook();
                b.book(v);
            }
        });
    }
        public class Addbook{
            String s =  b1.getText().toString();
            String s1 = b2.getText().toString();
            String s2 = b3.getText().toString();
            String s3 = b4.getText().toString();
            String s4 = b5.getText().toString();
            public void book(View view) {

                if (s.isEmpty() == true) {
                    Toast.makeText(AddBook.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
                } else if (s1.isEmpty() == true) {
                    Toast.makeText(AddBook.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty() == true) {
                    Toast.makeText(AddBook.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
                } else if (s3.isEmpty() == true) {
                    Toast.makeText(AddBook.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
                } else if (s4.isEmpty() == true) {
                    Toast.makeText(AddBook.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
                } else {
                    long id = connectionClass.insertBook(s, s1, s2, s3, s4);
                    if (id < 0) {
                        Toast.makeText(AddBook.this, "New Book Added Successfully", Toast.LENGTH_SHORT).show();
                        b1.setText("");
                        b2.setText("");
                        b3.setText("");
                        b4.setText("");
                        b5.setText("");
                    }
                    else
                    {
                        Toast.makeText(AddBook.this, "New Book Cannot Added ", Toast.LENGTH_SHORT).show();
                        b1.setText("");
                        b2.setText("");
                        b3.setText("");
                        b4.setText("");
                        b5.setText("");
                    }
                }
            }
        }

}
