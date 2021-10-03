package _03_Conditional_Loops.Intermediate_Java;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1,x2,y1,y2;
        System.out.println("Please enter 1 point : ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.println("Please enter 2 point : ");
        x2 = in.nextInt();
        y2 = in.nextInt();
        double dist = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between two points: " + dist);
    }
}
