package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q5 {
    //W.A.P to calculate the area of parallelogram.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter base: ");
        int base = in.nextInt();
        System.out.println("Please enter height: ");
        int height = in.nextInt();
        int area = base*height;
        System.out.println("Area of parallelogram is: " +area);
    }
}
