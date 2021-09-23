package _02_FirstJava;

import java.util.Scanner;

public class Q6 {
    //W.A.P to print largest of the two numbers.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = 0;
        if(num1<num2)
        {
            result = num2;
        }else{
            result = num1;
        }
        System.out.println("largest  number is: " +result);

    }
}
