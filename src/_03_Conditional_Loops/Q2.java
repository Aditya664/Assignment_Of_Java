package _03_Conditional_Loops;

import java.util.Scanner;

public class Q2 {
    //W.A.P to calculate the area of the triangle
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter height of triangle: ");
        int height = in.nextInt();
        System.out.println("Please enter base of triangle: ");
        int base = in.nextInt();
        double area = (height*base)/2;
        System.out.println("Area of traingle is: " + area);


    }
}
