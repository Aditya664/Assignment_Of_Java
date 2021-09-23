package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q13 {
    //W.A.P to find perimeter of rhombus
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Side of rhombus: ");
            double side = scanner.nextDouble();
            double perimeter = 4*side;
            System.out.println("Perimeter of the rhombus is: "+perimeter);
        }
    }
