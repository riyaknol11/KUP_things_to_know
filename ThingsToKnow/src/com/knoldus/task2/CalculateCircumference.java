package com.knoldus.task2;


import java.util.Scanner;

class Circle {
    public static double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}
public class CalculateCircumference {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        double circumference = circle.getCircumference();


    }
}
