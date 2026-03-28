package com.airtribe.learntrack.service;

import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.entity.Courses;

import java.util.List;
import java.util.ArrayList;

public class CourseService {

    private List<Courses> courses = new ArrayList<>();

    public void addCourse(Courses c){
        courses.add(c);
    }

    public List<Courses> getAllCourse(){
        return courses;
    }

    public Courses findById(int id) {
        for (Courses c : courses) {
            if (c.getId() == id) {
                return c;
            }
        }
        throw new EntityNotFoundException("Course not found");
    }

    public void toggleCourse(int id) {
        Courses c = findById(id);
        c.setActive(!c.isActive());
    }

}
