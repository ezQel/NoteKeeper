package com.ezqel.notebook;

import android.provider.BaseColumns;

public final class NoteDatabaseContract {

    public static final class CourseInfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "course_info";
        public static final String COLUMN_COURSE_ID = "course_id";
        public static final String COLUMN_COURSE_TITLE = "course_title";

        public  static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
                + "(" + _ID +" INTEGER PRIMARY KEY, " + COLUMN_COURSE_ID + " TEXT NOT NULL UNIQUE, "
                + COLUMN_COURSE_TITLE + " TEXT NOT NULL )";

    }
    public static final class NoteInfoEntry implements BaseColumns{
        public static final String TABLE_NAME = "note_info";
        public static final String COLUMN_COURSE_ID = "course_id";
        public static final String COLUMN_NOTE_TITLE = "note_title";
        public static final String COLUMN_NOTE_TEXT= "note_text";

        public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
                +"(" + _ID + " INTEGER PRIMARY KEY," + COLUMN_COURSE_ID +" TEXT NOT NULL,"
                +  COLUMN_NOTE_TITLE + " TEXT, "+ COLUMN_NOTE_TEXT + " TEXT NOT NULL)";
    }

}
