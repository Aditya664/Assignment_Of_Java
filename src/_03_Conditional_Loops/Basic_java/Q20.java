package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q20 {
    //W.A.P to find total Area of Cube
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter side of cube: ");
        float side = in.nextFloat();
        float area = 6*(side*side);
        System.out.println("Surface area of cube is: " +area);

    }
}
