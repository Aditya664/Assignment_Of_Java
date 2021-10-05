package _03_Conditional_Loops.Functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int first = in.nextInt();
        System.out.println("Please enter second number:");
        int second = in.nextInt();
        System.out.println("Please enter third number:");
        int third = in.nextInt();
        int smallest = smallest(first, second, third);
        int largest = largest(first, second, third);
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Smallest number is: " + largest);



    }
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min){
            min = second;
//        }else if (first < min){
//            min = first;
        }else if(third < min){
            min = third;
        }
        return min;
    }
    public static int largest(int first, int second, int third) {
        int max = first;
        if(second > max){
            max = second;
        }else if(third > max){
            max = third;
        }
        return max;
    }
}
