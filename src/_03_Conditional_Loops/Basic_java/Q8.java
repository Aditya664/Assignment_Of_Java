package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q8 {
    //W.A.P to find perimeter of circle.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Radius of circle: ");
        double radius = in.nextDouble();
        double perimeter = 2 *(Math.PI)*radius;
        System.out.println("Perimeter of circle is: " +perimeter);
    }
}
