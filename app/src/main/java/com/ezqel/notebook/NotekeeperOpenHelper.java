package com.ezqel.notebook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class NotekeeperOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "note_keeper.db";
    public static  final int DATABASE_VERSION = 2;

    public NotekeeperOpenHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NoteDatabaseContract.CourseInfoEntry.CREATE_TABLE);
        db.execSQL(NoteDatabaseContract.NoteInfoEntry.CREATE_TABLE);

        DBDataWorker dbDataWorker = new DBDataWorker(db);
        dbDataWorker.insertCourses();
        dbDataWorker.insertSampleNotes();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
