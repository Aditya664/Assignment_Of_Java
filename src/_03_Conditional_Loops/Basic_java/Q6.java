package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q6 {
    //W.A.P to calculate the area of rhombus.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter diagonal 1 : ");
        double d1 = in.nextDouble();
        System.out.println("Please enter diagonal 2 : ");
        double d2 = in.nextDouble();
        double area = (d1*d2)/2;
        System.out.println("Area of rhombus is: "+area );
    }
}
