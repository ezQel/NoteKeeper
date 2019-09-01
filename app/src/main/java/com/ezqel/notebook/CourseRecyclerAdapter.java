package com.ezqel.notebook;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CourseRecyclerAdapter extends RecyclerView.Adapter<CourseRecyclerAdapter.CourseViewHolder> {

    List<CourseInfo> mCourse;

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_course_list, viewGroup, false);
        return new CourseViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder courseViewHolder, int i) {
        mCourse=DataManager.getInstance().getCourses();
        CourseInfo courseInfo = mCourse.get(i);
        courseViewHolder.courseName.setText(courseInfo.getTitle());
    }



    @Override
    public int getItemCount() {
        return  DataManager.getInstance().getCourses().size();
    }

    class CourseViewHolder extends RecyclerView.ViewHolder{

        private final TextView courseName;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            courseName = itemView.findViewById(R.id.course_name);

        }
    }

}
