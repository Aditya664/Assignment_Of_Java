package _03_Conditional_Loops.Intermediate_Java;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double disc = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter orignal price: ");
        double orgprice = in.nextInt();
        System.out.println("Enter discount per : ");
        disc = in.nextInt();
        if(disc >= 0){
            disc = orgprice - (orgprice * disc / 100);
            System.out.println(disc);
        }else{
            System.out.println(orgprice);
        }
    }

}
