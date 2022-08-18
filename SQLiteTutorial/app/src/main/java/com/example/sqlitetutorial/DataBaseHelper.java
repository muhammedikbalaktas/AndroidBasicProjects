package com.example.sqlitetutorial;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="Data";
    private static final String TABLE_STUDENT = "student";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";


    public DataBaseHelper(Context context) {


        super(context,DATABASE_NAME,null,1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("create table ").append(TABLE_STUDENT)
                .append("(").append(KEY_ID).append(" integer primary key autoincrement,")
                .append(KEY_NAME).append(" text);");
        db.execSQL(stringBuilder.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    void insertStudent(String name){
            SQLiteDatabase db=this.getWritableDatabase();

        ContentValues contentValues=new ContentValues();
        contentValues.put(KEY_NAME,name);

        db.insert(TABLE_STUDENT,null,contentValues);
        db.close();
    }



    public ArrayList<String> getAllStudents(){

        ArrayList<String> result=new ArrayList<>();

        String selectQuery="select * from "+TABLE_STUDENT;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(selectQuery,null);

        if(cursor.moveToFirst()){
            do {
                String name=cursor.getString(1);
                result.add(name);

            }while (cursor.moveToNext());
        }
        cursor.close();
        return result;
    }
}
