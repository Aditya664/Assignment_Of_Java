package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q19 {
    //W.A.P to find Curved Surface Area Of Cylinder
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        float radius = in.nextFloat();
        System.out.println("Please enter height: ");
        float height = in.nextFloat();
        double surface = 2*Math.PI*radius*height;
        System.out.println("Curved surface area of cylinder is :" +surface);
    }
}
