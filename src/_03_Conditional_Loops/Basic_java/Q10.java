package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q10 {
    //W.A.P to find perimeter of parallelogram
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter base; ");
        double base = scanner.nextDouble();
        System.out.println("Please enter height; ");
        double height = scanner.nextDouble();
        double perimeter = 2*(base+height);
        System.out.println("Perimeter of parallelogram is: " +perimeter);



    }
}
