package com;

public class Enrollment {
 private Student student;
 private Course course;

 // Constructor to initialize student and course
 public Enrollment(Student student, Course course) {
     this.student = student;
     this.course = course;
 }

 // Method to show enrollment details
 public void showEnrollmentDetails() {
     System.out.println("Enrollment Details:");
     System.out.println("-------------------");
     student.displayStudentInfo();
     System.out.println();
     course.displayCourseInfo();
     System.out.println();
 }
}
