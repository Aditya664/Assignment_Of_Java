package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q14 {
    //W.A.P to find volume of cone
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Radius of cone: ");
        double radius = in.nextDouble();
        System.out.println("Please enter height of cone: ");
        double height = in.nextDouble();
        double volume = (Math.PI*radius*radius)*height/3;
        System.out.println("Volume of cone is: " +volume);
    }
}
