package com;

public class Student {
 private String studentId;
 private String studentName;
 private String email;

 // Parameterized constructor
 public Student(String studentId, String studentName, String email) {
     this.studentId = studentId;
     this.studentName = studentName;
     this.email = email;
 }

 // Method to display student details
 public void displayStudentInfo() {
     System.out.println("Student ID: " + studentId);
     System.out.println("Student Name: " + studentName);
     System.out.println("Email: " + email);
 }
}
