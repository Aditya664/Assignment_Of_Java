package _03_Conditional_Loops.Intermediate_Java;

import java.util.Scanner;

public class Q1_While {
    public static void main(String[] args) {
        //Factorial Program In Java
        int num;
        int fact = 1;
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number to find factorial: ");
        num = in.nextInt();

        while(i <= num){
            fact = fact * i;
            i++;

        }
        System.out.println("Factorial of " + num + "is: " + fact);
    }
}
