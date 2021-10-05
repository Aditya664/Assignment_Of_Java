package _04_Functions;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Please entre second number: ");
        int num2 = in.nextInt();
        int product = product(num1,num2);
        System.out.println("product of two number is : " + product);
    }
    public static int product(int n1,int n2){
        int product =0;
        product = n1 * n2;
        return product;
    }
}
