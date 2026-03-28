package com.airtribe.learntrack.entity;

public class Student extends Person {
    private String batch;
    private boolean active;

    //parameterized constructor
    public Student(int id,String firstName, String lastName,String email, String batch){
        super(id,firstName,lastName,email);
        this.batch=batch;
        this.active=true;
    }

    //constructor overloading
    public Student(int id,String firstName, String lastName,String batch){
        this(id, firstName, lastName, null, batch);
    }


    @Override
    public String getRole() {
        return "Student:";
    }

    @Override
    public String getDisplayName() {
        return "Student: "+ super.getDisplayName();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
