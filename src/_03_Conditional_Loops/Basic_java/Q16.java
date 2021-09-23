package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q16 {
    //W.A.P to find volume of cylinder
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius of cylinder: ");
        double radius = in.nextDouble();
        System.out.println("Please enter height of cylinder: ");
        double height = in.nextDouble();
        double volume = Math.PI*radius*radius*height;
        System.out.println("Volume of cylinder is: "+volume);
    }
}
