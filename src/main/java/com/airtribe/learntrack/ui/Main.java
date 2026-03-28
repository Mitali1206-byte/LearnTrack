package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.entity.*;
import com.airtribe.learntrack.service.*;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while (true) {
            System.out.println("\n=== LearnTrack Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. Enroll Student");
            System.out.println("5. Update Enrollment Status");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    // Add Student
                    case 1:
                        System.out.print("First Name: ");
                        String fn = sc.next();

                        System.out.print("Last Name: ");
                        String ln = sc.next();

                        System.out.print("Batch: ");
                        String batch = sc.next();

                        Student s = new Student(
                                IdGenerator.getStudentId(),
                                fn,
                                ln,
                                batch
                        );

                        studentService.addStudent(s);
                        System.out.println("Student added!");
                        break;

                    // View Students
                    case 2:
                        for (Student st : studentService.getAllStudent()) {
                            System.out.println(st.getDisplayName() + " | Active: " + st.isActive());
                        }
                        break;

                    // Add Course
                    case 3:
                        System.out.print("Course Name: ");
                        String cn = sc.next();

                        Courses c = new Courses(
                                IdGenerator.getCourseId(),
                                cn,
                                "Basic Course",
                                "4"
                        );

                        courseService.addCourse(c);
                        System.out.println(" Course added!");
                        break;

                    // Enroll Student
                    case 4:
                        System.out.print("Student ID: ");
                        int sid = sc.nextInt();

                        System.out.print("Course ID: ");
                        int cid = sc.nextInt();

                        Enrollment e = new Enrollment(
                                IdGenerator.getEnrollmentId(),
                                sid,
                                cid
                        );

                        enrollmentService.enroll(e);
                        System.out.println("Enrollment successful!");
                        break;

                    // Update Status USING ENUM
                    case 5:
                        System.out.print("Student ID: ");
                        int sId = sc.nextInt();

                        System.out.print("Course ID: ");
                        int cId = sc.nextInt();

                        System.out.println("Select Status:");
                        System.out.println("1. COMPLETED");
                        System.out.println("2. CANCELLED");

                        int statusChoice = sc.nextInt();

                        EnrollmentStatus status;

                        if (statusChoice == 1) {
                            status = EnrollmentStatus.COMPLETED;
                        } else if (statusChoice == 2) {
                            status = EnrollmentStatus.CANCELLED;
                        } else {
                            System.out.println("Invalid status option");
                            break;
                        }

                        enrollmentService.updateStatus(sId, cId, status);
                        System.out.println("Status updated!");
                        break;

                    // Exit
                    case 6:
                        System.out.println("Exiting...");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option");
                }

            } catch (Exception ex) {
                System.out.println(" Error: " + ex.getMessage());
            }
        }
    }
}