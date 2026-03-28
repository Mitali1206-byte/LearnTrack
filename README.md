# LearnTrack
LearnTrack is a **console-based application** built using Core Java to manage:  * Students * Courses * Enrollments  This project focuses on **strong fundamentals of Java and Object-Oriented Programming (OOP

 Features

###  Student Management

* Add new student
* View all students
* Search student by ID
* Deactivate student

###  Course Management

* Add new course
* View all courses
* Activate/Deactivate course

###  Enrollment Management

* Enroll a student in a course
* Update enrollment status
* Status values:

  * ACTIVE
  * COMPLETED
  * CANCELLED

---

#Concepts Covered

### 🔹 Core Java

* Variables, data types, control flow
* Loops (`for`, `while`)
* Scanner for input

### 🔹 OOP Principles

* **Encapsulation** → private fields + getters/setters
* **Inheritance** → `Person` → `Student`
* **Polymorphism** → method overriding (`getDisplayName()`)
* **Abstraction** → `Person` as abstract class

### 🔹 Advanced Basics

* **Enum** → `EnrollmentStatus` (type-safe status handling)
* **Collections** → `ArrayList` for dynamic storage
* **Exception Handling** → custom exception (`EntityNotFoundException`)
* **Static Usage** → `IdGenerator` for unique IDs

---

## Project Structure

```text
com.airtribe.learntrack
│
├── entity
│   ├── Person.java (abstract)
│   ├── Student.java
│   ├── Course.java
│   ├── Enrollment.java
│   ├── EnrollmentStatus.java (enum)
│
├── service
│   ├── StudentService.java
│   ├── CourseService.java
│   ├── EnrollmentService.java
│
├── exception
│   └── EntityNotFoundException.java
│
├── util
│   └── IdGenerator.java
│
├── ui
│   └── Main.java
```

---

# How to Run the Project

# Prerequisites

* Java JDK 8 or above installed

# Compile

```bash
javac com/airtribe/learntrack/ui/Main.java
```

# Run

```bash
java com.airtribe.learntrack.ui.Main
```

---

# Sample Menu

```text
=== LearnTrack Menu ===
1. Add Student
2. View Students
3. Add Course
4. Enroll Student
5. Update Enrollment Status
6. Exit
```

---

# Design Decisions

# Why ArrayList instead of Array?

* Dynamic size (no fixed length)
* Easier to manage (add/remove elements)

---

# Why Abstract Class (`Person`)?

* Represents a base entity not meant to be instantiated
* Allows code reuse for subclasses like `Student`

---

# Why Private Fields?

* Ensures **strict encapsulation**
* Data is accessed via controlled methods (getters/setters)

---

# Why Enum (`EnrollmentStatus`)?

* Prevents invalid values
* Improves type safety and readability

---

# Why Static (`IdGenerator`)?

* Provides unique IDs across the application
* Shared counter across all objects

---

## 📊 Class Diagram

```text
Person (abstract)
   ↑
   |
Student

Student → StudentService
Course → CourseService
Enrollment → EnrollmentService

Enrollment → EnrollmentStatus (enum)
```

---
 Exception Handling

* Custom exception:

  * `EntityNotFoundException`
* Used when:

  * Student or Course is not found
* Prevents application crash and shows user-friendly messages

