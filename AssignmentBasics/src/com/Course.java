package com;

public class Course {
 private String courseId;
 private String courseName;
 private String instructor;

 // Parameterized constructor
 public Course(String courseId, String courseName, String instructor) {
     this.courseId = courseId;
     this.courseName = courseName;
     this.instructor = instructor;
 }

 // Method to display course details
 public void displayCourseInfo() {
     System.out.println("Course ID: " + courseId);
     System.out.println("Course Name: " + courseName);
     System.out.println("Instructor: " + instructor);
 }
}
