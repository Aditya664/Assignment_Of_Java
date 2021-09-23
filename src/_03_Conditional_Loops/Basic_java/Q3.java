package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q3 {
    //W.A.P to calculate the area of rectangle
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Length of the triangle: ");
        float length = in.nextFloat();
        System.out.println("Please enter Weight of the triangle: ");
        float weight = in.nextFloat();
        float area = weight * length;
        System.out.println("Area of the triangle: " +area);

    }

}
