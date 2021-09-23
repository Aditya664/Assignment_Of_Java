package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q11 {
    //W.A.P to find perimeter of rectangle
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter width: ");
        double width = scanner.nextDouble();
        double perimeter = 2*(length+width);
        System.out.println("Perimeter of triangle is: " + perimeter);

    }
}
