package _02_FirstJava;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //W.A.P to print greeting message.
        System.out.println("Hey! Please enter your goodname: ");
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        System.out.println("Happy Birthday " + name);
    }
}
