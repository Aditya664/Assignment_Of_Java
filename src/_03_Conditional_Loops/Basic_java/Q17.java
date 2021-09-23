package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Q17 {
    //W.A.P to find find volume of sphere
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius of sphere: ");
        double radius = in.nextDouble();
        double volume = 4/3*Math.PI*radius*radius*radius;
        System.out.println("Volume of sphere: " + volume);
    }
}
