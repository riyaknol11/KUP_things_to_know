package com.knoldus.task5;

public class Student {
    // Static variable to keep track for the number of students enrolled
    private static int numOfStudents = 0;

    public Student() {
        numOfStudents++;
    }

    public static int getNumOfStudents()
    {
        return numOfStudents;
    }
    public static void main(String[]args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("Total number of students enrolled: " + Student.getNumOfStudents());
    }
}