package com.ezqel.notebook;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataManagerTest {

    static DataManager dm;

    @BeforeClass
    public static void dminit(){
        dm=DataManager.getInstance();
    }

    @Test
    public void createNewNote() throws Exception {
        dm = DataManager.getInstance();
        final CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "sample title";
        final String noteText = "This is sample note content";

        int noteIndex = dm.createNewNote();

        NoteInfo newNote = dm.getNotes().get(noteIndex);
        newNote.setCourse(course);
        newNote.setTitle(noteTitle);
        newNote.setText(noteText);

        NoteInfo compareNote = dm.getNotes().get(noteIndex);
       // assertSame(newNote, compareNote);

        assertEquals(compareNote.getCourse(), course);
        assertEquals(compareNote.getText(), noteText);
        assertEquals(compareNote.getTitle(), noteTitle);

    }


    @Test
    public void createNoteWithParams() throws Exception{

      /*  dm = DataManager.getInstance();
        final CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "sample title";
        final String noteText = "This is sample note content";

        int noteIndex = dm.createNewNote(course, noteTitle, noteText);

        NoteInfo compareNote = dm.getNotes().get(noteIndex);

        assertEquals(compareNote.getCourse(), course);
        assertEquals(compareNote.getText(), noteText);
        assertEquals(compareNote.getTitle(), noteTitle);

*/
    }


}