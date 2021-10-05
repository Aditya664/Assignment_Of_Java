package _04_Functions;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Please entre second number: ");
        int num2 = in.nextInt();
        int sum = Sum(num1,num2);
        System.out.println("sum of two number is : " + sum);
    }
    public static int Sum(int n1,int n2){
        int sum =0;
        sum = n1 + n2;
        return sum;
    }
}
