package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q9 {
    ////W.A.P to find perimeter of Equilateral triangle.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter side of triangle: ");
        double side = in.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of triangle is: " + perimeter);
    }
}
