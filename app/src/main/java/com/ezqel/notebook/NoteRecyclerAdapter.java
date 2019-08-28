package com.ezqel.notebook;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NoteRecyclerAdapter extends RecyclerView.Adapter<NoteRecyclerAdapter.ViewHolder>{

    private final Context mcontext;
    private final LayoutInflater layoutInflater;
    private final List<NoteInfo> mNotes;

    public NoteRecyclerAdapter(Context mcontext, List<NoteInfo> mNotes) {
        this.mcontext = mcontext;
        this.mNotes = mNotes;

        layoutInflater = LayoutInflater.from(this.mcontext);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = layoutInflater.inflate(R.layout.item_note_list, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        NoteInfo note = mNotes.get(position);
        viewHolder.textCourse.setText(note.getCourse().getTitle());
        viewHolder.textTitle.setText(note.getTitle());
        viewHolder.mposition = position;



    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public final TextView textCourse;
        public final TextView textTitle;
        public int mposition;

        public ViewHolder(final View view){
            super(view);
            textCourse = (TextView) view.findViewById(R.id.text_course);
            textTitle = (TextView) view.findViewById(R.id.text_title);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mcontext, NoteActivity.class);
                    intent.putExtra(NoteActivity.NOTE_POSITION, mposition);
                    mcontext.startActivity(intent);
                }
            });

         /*  textCourse.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Snackbar.make(v, textCourse.getText(), Snackbar.LENGTH_LONG).show();
               }
           });*/
        }

    }
}
