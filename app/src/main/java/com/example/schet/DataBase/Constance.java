package com.example.schet.DataBase;

public class Constance {
    public static final String TABLE_NAME = "my_table";
    public static final String ID = "id";
    public static final String VALUE = "value";
    public static final String DATABASE_NAME = "my_base.db";
    public static final int VERSION = 1;

    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
            " (" + ID + " INTEGER PRIMARY KEY, "+
            VALUE +" INTEGER)";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
