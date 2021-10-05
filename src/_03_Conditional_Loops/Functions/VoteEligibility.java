package _03_Conditional_Loops.Functions;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age to check eligibility for voting:");
        int age = in.nextInt();
        ChceckAge(age);


    }
    public static void ChceckAge(int age){
      if(age >= 18){
          System.out.println("Eligible: ");
      }else{
          System.out.println("Uneligible: ");
      }
    }
}
