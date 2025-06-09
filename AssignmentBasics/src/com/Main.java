package com;

public class Main {
 public static void main(String[] args) {
     Student student1 = new Student("S101", "Alice Johnson", "alice@example.com");

     Course course1 = new Course("CSE101", "Data Structures", "Dr. Smith");

     Enrollment enrollment1 = new Enrollment(student1, course1);

     enrollment1.showEnrollmentDetails();
 }
}

