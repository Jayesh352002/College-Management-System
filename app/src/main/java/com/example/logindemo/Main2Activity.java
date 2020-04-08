package com.example.logindemo;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends Activity {
    Button L ;
    RadioButton r1,r2,r3,r4,r5;

    EditText t1 , t2 ;
    String [] teach = {"AkshayPakhare","Monika_Rajput","A.S.Anwar","U_Deshmukh","S__arutwar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        L = findViewById(R.id.b3);
        r1 = (RadioButton) findViewById(R.id.Comp);
        r2 = (RadioButton) findViewById(R.id.ci);
        r3 = (RadioButton) findViewById(R.id.Auto);
        r4 = (RadioButton) findViewById(R.id.Mech);
        r5 = (RadioButton) findViewById(R.id.Elec);
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
                    if (r1 == null || r2 != null || r3 != null || r4 != null || r5 != null) {
                        for (int i = 0; i < teach.length; i++) {
                            if (teach[i].equals(s1)) {
                                Intent x = new Intent(Main2Activity.this, Computer.class);
                                Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                startActivity(x);
                                break;
                            } else {
                                Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                         else if (r1 != null || r2 == null || r3 != null || r4 != null || r5 != null) {
                        for (int i = 0; i < teach.length; i++) {
                            if (teach[i].equals(s1)) {
                                Intent x = new Intent(Main2Activity.this, Civil.class);
                                Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                startActivity(x);
                                break;
                            } else {
                                Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                            }
                        }
                        } else if (r1 != null || r2 != null || r3 == null || r4 != null || r5 != null) {
                        for (int i = 0; i < teach.length; i++) {
                            if (teach[i].equals(s1)) {
                                Intent x = new Intent(Main2Activity.this, Auto.class);
                                Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                startActivity(x);
                                break;
                            } else {
                                Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                            }
                        }
                        } else if (r1 != null || r2 != null || r3 != null || r4 == null || r5 != null) {
                        for (int i = 0; i < teach.length; i++) {
                            if (teach[i].equals(s1)) {
                                Intent x = new Intent(Main2Activity.this, Mech.class);
                                Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                startActivity(x);
                                break;
                            } else {
                                Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                            }
                        }
                        } else if (r1 != null || r2 != null || r3 != null || r4 != null || r5 == null) {
                        for (int i = 0; i < teach.length; i++) {
                            if (teach[i].equals(s1)) {
                                Intent x = new Intent(Main2Activity.this, Elec.class);
                                Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                startActivity(x);
                                break;
                            } else {
                                Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                            }
                        }
                        }
                    if (r1 != null || r2 != null || r3 != null || r4 != null || r5 != null) {
                        Toast.makeText(Main2Activity.this, "Please Select Branch", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(Main2Activity.this, "Please Enter Login Details", Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*L.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(r1.isChecked())
               {
                   String s1 = new String();
                   String s2 = new String();
                   s1 = t1.getText().toString();
                   s2 = t2.getText().toString();
                   if (s1.isEmpty() != true && s2.isEmpty() != true) {
                       for (int i = 0; i < teach.length; i++) {
                           if (teach[i].equals(s1)) {
                               Intent x = new Intent(Main2Activity.this, Computer.class);
                               Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                               startActivity(x);
                               break;
                           } else {
                               Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                           }
                       }

                   }
               }
               else if(r2.isChecked())
               {
                   String s1 = new String();
                   String s2 = new String();
                   s1 = t1.getText().toString();
                   s2 = t2.getText().toString();
                   if (s1.isEmpty() != true && s2.isEmpty() != true) {
                       for (int i = 0; i < teach.length; i++) {
                           if (teach[i].equals(s1)) {
                               Intent x = new Intent(Main2Activity.this, Civil.class);
                               Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                               startActivity(x);
                               break;
                           } else {
                               Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                           }
                       }

                   }
               }
               else if(r3.isChecked())
               {
                   String s1 = new String();
                   String s2 = new String();
                   s1 = t1.getText().toString();
                   s2 = t2.getText().toString();
                   if (s1.isEmpty() != true && s2.isEmpty() != true) {
                       for (int i = 0; i < teach.length; i++) {
                           if (teach[i].equals(s1)) {
                               Intent x = new Intent(Main2Activity.this, Auto.class);
                               Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                               startActivity(x);
                               break;
                           } else {
                               Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                           }
                       }

                   }
               }
               else if (r4.isChecked())
               {
                   String s1 = new String();
                   String s2 = new String();
                   s1 = t1.getText().toString();
                   s2 = t2.getText().toString();
                   if (s1.isEmpty() != true && s2.isEmpty() != true) {
                       for (int i = 0; i < teach.length; i++) {
                           if (teach[i].equals(s1)) {
                               Intent x = new Intent(Main2Activity.this, Mech.class);
                               Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                               startActivity(x);
                               break;
                           } else {
                               Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                           }
                       }

                   }
               }
               else if(r5.isChecked())
               {
                   String s1 = new String();
                   String s2 = new String();
                   s1 = t1.getText().toString();
                   s2 = t2.getText().toString();
                   if (s1.isEmpty() != true && s2.isEmpty() != true) {
                       for (int i = 0; i < teach.length; i++) {
                           if (teach[i].equals(s1)) {
                               Intent x = new Intent(Main2Activity.this, Elec.class);
                               Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                               startActivity(x);
                               break;
                           } else {
                               Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                           }
                       }

                   }
               }
               else
               {
                   Toast.makeText(Main2Activity.this, "Please Select Branch", Toast.LENGTH_SHORT).show();
               }
           }
       });
         r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                L.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1 = new String();
                        String s2 = new String();
                        s1 = t1.getText().toString();
                        s2 = t2.getText().toString();
                        if (s1.isEmpty() != true && s2.isEmpty() != true) {
                            for (int i = 0; i < teach.length; i++) {
                                if (teach[i].equals(s1)) {
                                    Intent x = new Intent(Main2Activity.this, Computer.class);
                                    Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                    startActivity(x);
                                    break;
                                } else {
                                    Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                    }
                });
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                L.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1 = new String();
                        String s2 = new String();
                        s1 = t1.getText().toString();
                        s2 = t2.getText().toString();
                        if (s1.isEmpty() != true && s2.isEmpty() != true) {
                            for (int i = 0; i < teach.length; i++) {
                                if (teach[i].equals(s1)) {
                                    Intent x = new Intent(Main2Activity.this, Civil.class);
                                    Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                    startActivity(x);
                                    break;
                                } else {
                                    Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                    }
                });
            }
        });

        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                L.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1 = new String();
                        String s2 = new String();
                        s1 = t1.getText().toString();
                        s2 = t2.getText().toString();
                        if (s1.isEmpty() != true && s2.isEmpty() != true) {
                            for (int i = 0; i < teach.length; i++) {
                                if (teach[i].equals(s1)) {
                                    Intent x = new Intent(Main2Activity.this, Auto.class);
                                    Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                    startActivity(x);
                                    break;
                                } else {
                                    Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                    }
                });
            }
        });

        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                L.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1 = new String();
                        String s2 = new String();
                        s1 = t1.getText().toString();
                        s2 = t2.getText().toString();
                        if (s1.isEmpty() != true && s2.isEmpty() != true) {
                            for (int i = 0; i < teach.length; i++) {
                                if (teach[i].equals(s1)) {
                                    Intent x = new Intent(Main2Activity.this, Mech.class);
                                    Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                    startActivity(x);
                                    break;
                                } else {
                                    Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                    }
                });
            }
        });
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                L.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1 = new String();
                        String s2 = new String();
                        s1 = t1.getText().toString();
                        s2 = t2.getText().toString();
                        if (s1.isEmpty() != true && s2.isEmpty() != true) {
                            for (int i = 0; i < teach.length; i++) {
                                if (teach[i].equals(s1)) {
                                    Intent x = new Intent(Main2Activity.this, Elec.class);
                                    Toast.makeText(Main2Activity.this, "Attendance Done", Toast.LENGTH_SHORT).show();
                                    startActivity(x);
                                    break;
                                } else {
                                    Toast.makeText(Main2Activity.this, "No Teacher Found", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                    }
                });
            }
        });*/
    }
}
