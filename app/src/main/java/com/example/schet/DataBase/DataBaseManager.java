package com.example.schet.DataBase;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.renderscript.Sampler;

public class DataBaseManager {
    private Context context;
    private DataBaseHelper dataBaseHelper;
    private SQLiteDatabase db;

    public DataBaseManager(Context context) {
        this.context = context;
        dataBaseHelper = new DataBaseHelper(context);
    }
    public void openDb(){
        db = dataBaseHelper.getWritableDatabase();
    }
    public void insertToDb(int value){
        ContentValues cv = new ContentValues();
        cv.put(Constance.VALUE, value);
        db.insert(Constance.TABLE_NAME,null,cv);
    }

    public int getToDb(){
        Cursor cursor = db.query(Constance.TABLE_NAME,null,null,null,null,null,null);
        @SuppressLint("Range") Integer score = cursor.getInt(cursor.getColumnIndex(Constance.VALUE));
        cursor.close();
        return score;
    }
    public void update(int sc){
        Cursor cursor = db.query(Constance.TABLE_NAME,null,null,null,null,null,null);
        ContentValues cv = new ContentValues();
        @SuppressLint("Range") Integer score = cursor.getInt(cursor.getColumnIndex(Constance.VALUE))+sc;
        cv.put(Constance.VALUE,score);
        db = dataBaseHelper.getWritableDatabase();
        db.update(Constance.TABLE_NAME,cv,null,null);
        cursor.close();
    }

    public void close(){
dataBaseHelper.close();
    }
}
