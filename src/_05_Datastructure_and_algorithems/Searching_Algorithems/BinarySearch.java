package Searching_Algorithems;

import java.util.ArrayList;
import java.util.Scanner;


public class BinarySearch 
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
		boolean found=Search(numbers,target,0,numbers.size()-1);
		System.out.println(found);
		
	}

	private static boolean Search(ArrayList<Integer> numbers, int target,int left, int right) 
	{
		
		int mid=(left+right)/2;
		
		if(mid>=right)
		{
			return false;
		}
		if(numbers.get(mid)==target)
		{
			return true;
		}
		else if(numbers.get(mid)<target)
		{
			left=mid+1;
			return Search(numbers, target, left, right);
		}
		else
		{
			right=mid-1;
			return Search(numbers, target, left, right);
		}
	}
}
