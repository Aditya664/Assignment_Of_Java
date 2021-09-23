package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q4 {
    //W.A.P to calculate the area of isosceles triangle.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter base of triangle: ");
        float base = in.nextFloat();
        System.out.println("Please enter height of triangle: ");
        float height = in.nextFloat();
        float area = base * height/2;
        System.out.println("Area of isosceles triangle is: " +area);

    }
}
