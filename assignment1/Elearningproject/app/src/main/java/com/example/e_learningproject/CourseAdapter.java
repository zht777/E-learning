package com.example.e_learningproject;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CourseAdapter extends ArrayAdapter<course> {
    private int resourceId;
    public CourseAdapter(Context context, int textViewResourceId, List<course> objects) {
        super(context, textViewResourceId, objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        course courese=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView courseImage=(ImageView)view.findViewById(R.id.course_image);
        TextView courseName=(TextView)view.findViewById(R.id.course_name);
        courseImage.setImageResource(courese.getImageId());
        courseName.setText(courese.getName());
        return view;
    }
}
