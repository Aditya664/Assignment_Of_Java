package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q7 {
    //W.A.P to calculate the area of Equilateral triangle
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter sides of triangle: ");
        double sides = in.nextDouble();
        double area = (Math.sqrt(3)/4)*sides*sides;
        System.out.println("Area of Equilateral triangle is: " +area);
    }
}
