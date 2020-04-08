package com.example.logindemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;


public class myDbAdapter {
    myDbHelper myhelper;
    public myDbAdapter(Context context)
    {
        myhelper = new myDbHelper(context);
    }

    public long insertData(String name, String mo , String qual , String add , String gen , String age , String bir , String em)
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.NAME, name);
        contentValues.put(myDbHelper.MOBILENO, mo);
        contentValues.put(myDbHelper.Quali, qual);
        contentValues.put(myDbHelper.Adderss, add);
        contentValues.put(myDbHelper.Gender, gen);
        contentValues.put(myDbHelper.Age, age);
        contentValues.put(myDbHelper.Birth, bir);
        contentValues.put(myDbHelper.Email, em);
        long id = dbb.insert(myDbHelper.TABLE_NAME1, null , contentValues);
        return id;
    }

    public long insertStud(String name, String mo , String qual , String add , String gen , String age , String bir , String em , String en , String roll , String br )
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.NAME, name);
        contentValues.put(myDbHelper.MOBILENO, mo);
        contentValues.put(myDbHelper.Quali, qual);
        contentValues.put(myDbHelper.Adderss, add);
        contentValues.put(myDbHelper.Gender, gen);
        contentValues.put(myDbHelper.Age, age);
        contentValues.put(myDbHelper.Birth, bir);
        contentValues.put(myDbHelper.Email, em);
        contentValues.put(myDbHelper.Enroll, en);
        contentValues.put(myDbHelper.roll, roll);
        contentValues.put(myDbHelper.branch, br);
        //contentValues.put(myDbHelper.year, ye);
        //contentValues.put(myDbHelper.ssc, ssc);
        long id = dbb.insert(myDbHelper.TABLE_NAME2, null , contentValues);
        return id;
    }

    public long insertBook(String i, String name , String quant , String pr , String br )
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.bookid, i);
        contentValues.put(myDbHelper.bookname, name);
        contentValues.put(myDbHelper.quantity, quant);
        contentValues.put(myDbHelper.price, pr);
        contentValues.put(myDbHelper.branch, br);
        long id = dbb.insert(myDbHelper.TABLE_NAME3, null , contentValues);
        return id;
    }
    public void teachAttendence()
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.presenty, "Yes");
    }

    public String getData()
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] columns = {myDbHelper.UID,myDbHelper.NAME,myDbHelper.MOBILENO,myDbHelper.Quali,myDbHelper.Adderss,myDbHelper.Gender,myDbHelper.Age,myDbHelper.Birth,myDbHelper.Email};
        Cursor cursor =db.query(myDbHelper.TABLE_NAME3,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(myDbHelper.UID));
            String name =cursor.getString(cursor.getColumnIndex(myDbHelper.NAME));
            int mo =cursor.getInt(cursor.getColumnIndex(myDbHelper.MOBILENO));
            String q = cursor.getString(cursor.getColumnIndex(myDbHelper.Quali));
            String a = cursor.getString(cursor.getColumnIndex(myDbHelper.Adderss));
            String g = cursor.getString(cursor.getColumnIndex(myDbHelper.Gender));
            int age = cursor.getInt(cursor.getColumnIndex(myDbHelper.Age));
            int b = cursor.getInt(cursor.getColumnIndex(myDbHelper.Birth));
            String e = cursor.getString(cursor.getColumnIndex(myDbHelper.Email));
            buffer.append(cid+ "   " + name + "   " + mo +" \n" + q + "   " + a + "   " + g + "   " + age +"   "+ b +"   "+ e+"   ");
        }
        return buffer.toString();
    }
    public boolean checkIfRecordExist(String TABLE_NAME,String COL_2,String chek)
    {
        try
        {
            SQLiteDatabase db=this.getReadableDatabase();
            Cursor cursor=db.rawQuery("SELECT "+COL_2+" FROM "+TABLE_NAME+" WHERE "+COL_2+"='"+COL_2+"'",null);
            if (cursor.moveToFirst())
            {
                db.close();
                Log.d("Record  Already Exists", "Table is:"+TABLE_NAME+" ColumnName:"+COL_2);
                return true;//record Exists

            }
            Log.d("New Record  ", "Table is:"+TABLE_NAME+" ColumnName:"+COL_2+" Column Value:"+COL_2);
            db.close();
        }
        catch(Exception errorException)
        {
            Log.d("Exception occured", "Exception occured "+errorException);
            // db.close();
        }
        return false;
    }

    private SQLiteDatabase getReadableDatabase() {
        return null;
    }

    public  int delete(String uname)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] whereArgs ={uname};

        int count =db.delete(myDbHelper.TABLE_NAME1 ,myDbHelper.NAME+" = ?",whereArgs);
        return  count;
    }

    public int updateName(String oldName , String newName)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.NAME,newName);
        String[] whereArgs= {oldName};
        int count =db.update(myDbHelper.TABLE_NAME1,contentValues, myDbHelper.NAME+" = ?",whereArgs );
        return count;
    }

    static class myDbHelper extends SQLiteOpenHelper
    {
        private static final String DATABASE_NAME = "CollegeManagement";    // Database Name
        private static final String TABLE_NAME1 = "AllTeacher";
        private static final String TABLE_NAME2 = "AllStudent";// Table Name
        private static final String TABLE_NAME3 = "AddBook";
        private static final int DATABASE_Version = 1;    // Database Version
        private static final String UID="id";     // Column I (Primary Key)
        private static final String NAME = "Name";    //Column II
        private static final String MOBILENO= "Mobile";    // Column III
        private static final String Quali= "Qualification";
        private static final String Adderss= "Address";
        private static final String Gender= "Gender";
        private static final String Age= "Age";
        private static final String Birth= "Birth";
        private static final String Email= "Email-Id";
        private static final String Enroll= "";
        private static final String roll= "";
        private static final String ssc= "";
        private static final String branch= "";
        private static final String year= "";
        private static final String quantity= "";
        private static final String price= "";
        private static final String bookid= "";
        private static final String bookname= "";
        private static final String presenty= "";
        private Context context;

        public myDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
            this.context=context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
        /*
        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE);
            } catch (Exception e) {
                Toast.makeText(context, ""+e, Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                Toast.makeText(context, "On Upgrade", Toast.LENGTH_SHORT).show();
                db.execSQL(DROP_TABLE);
                onCreate(db);
            }catch (Exception e) {
                Toast.makeText(context, ""+e, Toast.LENGTH_SHORT).show();
            }
        }*/
    }
}