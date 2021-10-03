package _03_Conditional_Loops.Intermediate_Java;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int num;
        int fact = 1;
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter number to find factorial: ");
        num = in.nextInt();
        do{
            fact = fact * i;
            i++;
        }while(num >=i );
        System.out.println("Factorial of " + num + " is:" + fact);
    }
}
