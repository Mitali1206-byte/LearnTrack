package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.entity.EnrollmentStatus;

import java.util.List;
import java.util.ArrayList;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();

    public void enroll(Enrollment e) {
        enrollments.add(e);
    }

    public List<Enrollment> getAll() {
        return enrollments;
    }

    public void updateStatus(int studentId, int courseId, EnrollmentStatus status) {
        for (Enrollment e : enrollments) {
            if (e.getStudentId() == studentId && e.getCourseId() == courseId) {
                e.setStatus(status);
                return;
            }
        }
        System.out.println("Enrollment not found");
    }
}
