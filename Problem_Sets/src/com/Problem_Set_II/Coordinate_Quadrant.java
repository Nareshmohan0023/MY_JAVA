package com.Problem_Set_II;

public class Coordinate_Quadrant {
    public String Find_Quadrant(int x, int y) {
        System.out.println("----------------------------");
        System.out.println("The given coordinates are: (" + x + ", " + y + ")");
        
        if (x > 0 && y > 0) {
            return "The coordinate lies in Quadrant 1 (Q1)";
        } else if (x < 0 && y > 0) {
            return "The coordinate lies in Quadrant 2 (Q2)";
        } else if (x < 0 && y < 0) {
            return "The coordinate lies in Quadrant 3 (Q3)";
        } else if (x > 0 && y < 0) {
            return "The coordinate lies in Quadrant 4 (Q4)";
        } else if (x == 0 && y != 0) {
            return "The coordinate lies on the Y-axis";
        } else if (x != 0 && y == 0) {
            return "The coordinate lies on the X-axis";
        } else {
            return "The coordinate lies at the Origin (0, 0)";
        }
    }
}
