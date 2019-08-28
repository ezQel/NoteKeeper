package com.ezqel.notebook;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static org.hamcrest.Matchers.*;
import static android.support.test.espresso.Espresso.pressBack;




@RunWith(AndroidJUnit4.class)
public class NoteCreationTest {

    static DataManager dm;

    @BeforeClass
    public static void classSetup() throws Exception{
        dm = DataManager.getInstance();
    }

    @Rule
    public ActivityTestRule<NoteListActivity> mNoteListActivityRule= new ActivityTestRule<>(NoteListActivity.class);

    @Test
    public void createNewNote() throws Exception{

     /*   final CourseInfo courseInfo = dm.getCourse("java_lang");
        final String noteTitle = "Note Title";
        final String noteContent = "Sample Note content";

        //ViewInteraction fabNewNote = onView(withId(R.id.fab));
        //fabNewNote.perform(click());


        onView(withId(R.id.fab)).perform(click());
        onView(withId(R.id.spinner_courses)).perform(click());
        onData(allOf(instanceOf(CourseInfo.class),equalTo(courseInfo))).perform(click());
        onView(withId(R.id.text_note_title)).perform(typeText(noteTitle), closeSoftKeyboard());
        onView(withId(R.id.text_note_text)).perform(typeText(noteContent), closeSoftKeyboard());

        pressBack();
*/
    }
}