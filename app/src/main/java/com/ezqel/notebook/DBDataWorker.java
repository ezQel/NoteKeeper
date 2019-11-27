package com.ezqel.notebook;

import android.database.sqlite.SQLiteDatabase;


public class DBDataWorker {
    private SQLiteDatabase dbp;

    public DBDataWorker(SQLiteDatabase db){
        dbp = db;
    }

    public void insertCourses(){
        insertCourse("'android_intents'", "'Android Programming with Intents'");
        insertCourse("'android_async'", "'Android Async Programming and Services'");
        insertCourse("'java_lang'", "'Java Fundamentals: The Java language'");
        insertCourse("'java_core'", "'Java Fundamentals: The Core Platform'");

    }
    public void insertSampleNotes(){
        insertNote("'android_intents'", "'dynamic intent resolution'", "'Wow, intents Allow components to be..'");
        insertNote("'android_intents'", "'Delegating Intents'","'Pending Intents are powerful'");

        insertNote("'android_async'","'Service default threads'", "'Did you know by default android..'");
    }

    private void insertCourse(String course_id, String course_title){
       dbp.execSQL("INSERT INTO "+ NoteDatabaseContract.CourseInfoEntry.TABLE_NAME + "(course_id, course_title) VALUES (" + course_id
               + "," + course_title + ")");
    }
    private void insertNote(String course_id, String note_title, String note_text){
        dbp.execSQL("INSERT INTO "+ NoteDatabaseContract.NoteInfoEntry.TABLE_NAME + "(course_id, note_title, note_text) VALUES (" + course_id
                + "," + note_title + "," +note_text + ")" );
    }
}
