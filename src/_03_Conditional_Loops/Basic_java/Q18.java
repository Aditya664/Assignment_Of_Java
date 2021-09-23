package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q18 {
    //W.A.P to find volume of pyramid
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length: ");
        float length = scanner.nextFloat();
        System.out.println("Please enter width of pyramid: ");
        float width = scanner.nextFloat();
        System.out.println("Please enter height of pyramid: ");
        float height = scanner.nextFloat();
        float volume = length*width*height/3;
        System.out.println("Volume of pyramid is: " +volume);

    }
}
