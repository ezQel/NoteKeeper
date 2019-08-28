package com.ezqel.notebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.List;

public class NoteListActivity extends AppCompatActivity {
    private NoteRecyclerAdapter noteRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NoteListActivity.this, NoteActivity.class));
             }
        });

        initializeDisplayContent();
    }



    @Override
    protected void onResume() {
        super.onResume();
        noteRecyclerAdapter.notifyDataSetChanged();
    }

    private void initializeDisplayContent() {
        final RecyclerView recyclerNotes = findViewById(R.id.list_notes);
        final LinearLayoutManager notesLayout = new LinearLayoutManager(this);
        recyclerNotes.setLayoutManager(notesLayout);

        List<NoteInfo> notes = DataManager.getInstance().getNotes();
        noteRecyclerAdapter = new NoteRecyclerAdapter(this, notes);

        recyclerNotes.setAdapter(noteRecyclerAdapter);


    }

}
