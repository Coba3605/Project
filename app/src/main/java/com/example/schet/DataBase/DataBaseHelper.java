package com.example.schet.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(@Nullable Context context) {
        super(context, Constance.DATABASE_NAME, null, Constance.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constance.TABLE_STRUCTURE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Constance.DROP_TABLE);
        onCreate(db);
    }
}
