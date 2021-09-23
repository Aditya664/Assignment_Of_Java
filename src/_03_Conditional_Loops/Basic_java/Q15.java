package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q15 {
    //W.A.P to find volume of prism
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter base of prism: ");
        double base = in.nextDouble();
        System.out.println("Please enter height of prism: ");
        double height = in.nextDouble();
        double volume = base * height;
        System.out.println("Volume of prism is: " + volume);
    }
}
