package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.List;
import java.util.ArrayList;
public class StudentService
{
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getAllStudent(){
        return students;
    }

    public Student findsById(int id){

         for(Student s : students){
             if(s.getId()==id){
                return s;
             }
         }
         throw new EntityNotFoundException("Students not Found");
   }
   public void deactivateStudent(int id){
        Student s = findsById(id);
        s.setActive(false);
   }
}
