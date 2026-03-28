package com.airtribe.learntrack.entity;

public class Courses {

    private int id;
    private String courseName;
    private String description;
    private String durationInWeek;
    private boolean active;

    public Courses(int id,String courseName,String description ,String durationInWeek){
        this.id=id;
        this.courseName=courseName;
        this.description=description;
        this.durationInWeek=durationInWeek;
        this.active=true;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCourseName() {
        return courseName;
    }
}

