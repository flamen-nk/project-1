package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Hello world! Please, enter the coordinates:\n" +
                "A: ");
        triangle.setX1(in.nextDouble());
        triangle.setY1(in.nextDouble());
        System.out.println("B:");
        triangle.setX2(in.nextDouble());
        triangle.setY2(in.nextDouble());
        System.out.println("C: ");
        triangle.setX3(in.nextDouble());
        triangle.setY3(in.nextDouble());
        System.out.println("Length of side A: "+triangle.getVertexA());
        System.out.println("Length of side B: "+triangle.getVertexB());
        System.out.println("Length of side C: "+triangle.getVertexC());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area of triangle " + triangle.getArea());
        System.out.println("Angle of vertex A: " + triangle.getAngleA());
        System.out.println("Angle of vertex B: " + triangle.getAngleB());
        System.out.println("Angle of vertex C: " + triangle.getAngleC());
        System.out.println("Type of the triangle: " + triangle.getType());
    }
}