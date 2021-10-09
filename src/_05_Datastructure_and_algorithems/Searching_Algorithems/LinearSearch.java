package Searching_Algorithems;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int n=input.nextInt();
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Enter the data : ");
		for(int i=0;i<n;i++)
		{
			numbers.add(input.nextInt());
		}
		System.out.println("Enter the number that you want to search : ");
		int target=input.nextInt();
		boolean flag=false;
		for(int j : numbers)
		{
			if(j==target)
			{
				System.out.println("Number "+j+" is Found at position "+(numbers.indexOf(j)+1));
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Number "+target+" NOT FOUND");
		}
		
	}
}
