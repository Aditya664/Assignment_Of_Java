package _02_FirstJava;

import java.util.Scanner;

public class Q7 {
    //W.A.P to convert rupee to USD
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rupee = in.nextInt();
        double usd = 0;
        usd = rupee * 0.014;
        System.out.println("Rupees in usd is: " + usd);
    }
}
