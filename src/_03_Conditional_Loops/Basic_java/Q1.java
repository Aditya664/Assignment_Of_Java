package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q1 {
    //W.A.P to calculate the area of circle.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius of cricle: ");
        int radius = in.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("Area of circle is: " +area);
    }
}
