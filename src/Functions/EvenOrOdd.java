package Functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number to check even or odd: ");
        int num = in.nextInt();
        evenodd(num);

    }
    public static void evenodd(int number){
        if(number % 2 == 0){
            System.out.println("Given number is even. ");
        }else{
            System.out.println("Given number is odd.");
        }
    }
}
