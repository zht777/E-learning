package com.example.e_learningproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CourseList extends AppCompatActivity {

    private List<course> courseList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courselist);
        initcourse();
        CourseAdapter adapter=new CourseAdapter(CourseList.this,R.layout.course_layout,courseList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                course course=courseList.get(position);
                Intent intent3 = new Intent(CourseList.this, courseinfor.class);
                startActivity(intent3);
            }
        });

    }

    private void initcourse(){
        for(int i=0;i<5;i++){
            course and=new course("Android",R.drawable.and);
            courseList.add(and);
            course db=new course("database",R.drawable.b);
            courseList.add(db);

        }
    }
}
