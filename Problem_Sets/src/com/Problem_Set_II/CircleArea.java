package com.Problem_Set_II;

public class CircleArea {
    public double Calculate_Area_Of_Circle(double radius) {
        System.out.println("----------------------------");
        System.out.println("Calculating the area of a circle with radius: " + radius);

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return -1; // Indicates an invalid input
        }

        double area = Math.PI * radius * radius; // Using the formula πr²
        return area;
    }
}
