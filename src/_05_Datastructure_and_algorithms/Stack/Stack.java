package Stack;


public class Stack 
{
	
	int size;
	
	public Stack() 
	{
		
	}
	
	public Stack(int size) 
	{
		this.size=size;
	}
	
	Node head;
	public int top=-1;
	
	
	public void push(int data)
	{
		if(top<size-1)
		{
			Node node=new Node();
			node.data=data;
			node.next=null;
			
			if(head==null)
			{
				head=node;                 
			}
			else 
			{
				Node temp=new Node();
				temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=node;
			}
			top++;
			
		}
		else 
		{
			System.out.println("\nStack Overflow");
		}
	}
	
	public void show() 
	{
		Node node=new Node();
		node=head;
		try 
		{
			while(node.next!=null)
			{
				System.out.print(node.data);
				System.out.print(" --> ");
				node=node.next;
			}
			System.out.println(node.data);
		} catch (Exception e) 
		{
			System.out.println("No data Found");
		}
		
	}
	
	
	public int pop() 
	{
		
			Node temp;
			temp=head;
			int data;
			if(temp.next!=null)
			{
				while(temp.next.next!=null)        
				{
					temp=temp.next;
				}
				data=temp.next.data;
				temp.next=null;
				top--;
				return data;
			}
			else 
			{
				data=head.data;
				head=null;
				top--;
				return data;
			}
	}
	
	public int len()
	{
		return top+1;
	}
	
	public boolean isFound(int data)
	{
		Node temp=head;
		boolean found=false;
		if(temp.data==data)
		{
			found=true;
			return found;
		}
		while(temp.next!=null)
		{
			if(temp.data==data || temp.next.data==data)
			{
				found=true;
				break;
			}
			
			temp=temp.next;
		}
		return found;
	}


}
