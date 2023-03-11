package com.knoldus.task10.shapes;

import java.util.Scanner;

public class Shape
{
    public static void main(String args[])
    {
        Scanner takeInput = new Scanner(System.in);
        Circle circle1 = new Circle();
        int radius;
        System.out.println("Enter the radius of the circle: ");
        radius = takeInput.nextInt();
        System.out.println("The area of circle is: "+circle1.calculateArea(radius));
        System.out.println("The perimeter of circle is: "+circle1.calculatePerimeter(radius));
        Rectangle rectangle1 = new Rectangle();
        int length;
        int breadth;
        System.out.println("Enter the length of the rectangle: ");
        length = takeInput.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = takeInput.nextInt();
        System.out.println("The area of rectangle is: "+rectangle1.calculateArea(length, breadth));
        System.out.println("The perimeter of rectangle is: "+rectangle1.calculatePerimeter(length, breadth));
        Triangle triangle1 = new Triangle();
        int height;
        int base;
        System.out.println("Enter the height of the triangle: ");
        height = takeInput.nextInt();
        System.out.println("Enter the base of the triangle: ");
        base = takeInput.nextInt();
        System.out.println("The area of triangle is: "+triangle1.calculateArea(height, base));
        int side1;
        int side2;
        System.out.println("Enter the side 1 of the triangle: ");
        side1 = takeInput.nextInt();
        System.out.println("Enter the side 2 of the triangle: ");
        side2 = takeInput.nextInt();
        System.out.println("The perimeter of rectangle is: "+triangle1.calculatePerimeter(side1, base, side2));
    }
}