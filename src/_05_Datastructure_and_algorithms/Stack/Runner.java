package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Runner 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int option;
		BufferedReader userinp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of the Stack : ");
		int size=Integer.parseInt(userinp.readLine());
		Stack list=new Stack(size);
		
		while(true)
		{
			System.out.println("=====================================================");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Show");
			System.out.println("4. Length");
			System.out.println("5. isFound");
			System.out.println("6. Exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("Your Option : ");
			option=Integer.parseInt(userinp.readLine());
			System.out.println("=====================================================");
			switch(option) 
			{
			case 1:
				int data;
				System.out.println("Enter the Data : ");
				data=Integer.parseInt(userinp.readLine());
				list.push(data);
				break;
			case 2:
				if(list.top>=0)
				{
					System.out.println(list.pop());
				}
				else 
				{
					System.out.println("Stack Underflow");
				}
				break;
			case 3: 
				list.show();
				break;
			case 4:
				System.out.println(list.len());
				break;
			case 5:
				if(list.len()>0)
				{
					System.out.println("Enter the Data : ");
					int num=Integer.parseInt(userinp.readLine());
					System.out.println(list.isFound(num));
				}
				else 
				{
					System.out.println("No data Found");
				}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid Option");
				break;
			}
		}

	}
}
