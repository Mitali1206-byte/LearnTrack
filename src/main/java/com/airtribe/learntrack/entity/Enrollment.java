package com.airtribe.learntrack.entity;

import java.time.LocalDate;

public class Enrollment {

    private int id;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private EnrollmentStatus status;

    public Enrollment(int id, int student_id, int course_id ){
        this.id=id;
        this.courseId=courseId;
        this.studentId=studentId;
        this.enrollmentDate=LocalDate.now();
        this.status=EnrollmentStatus.ACTIVE;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

}
