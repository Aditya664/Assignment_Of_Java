package Queue;


public class Queue 
{
	
	int size;
	
	public Queue() 
	{
		
	}
	
	public Queue(int size) 
	{
		this.size=size;
	}
	
	Node head;
	int front=0, rear=0;
	
	
	public void enqueue(int data)
	{
		if((rear - front)<=size-1)
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
			rear++;
			
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
	
	
	public int dequeue() 
	{
		if(head.next!=null)
		{
			int data;
			data=head.data;
			head=head.next;
			front++;
			return data;
		}
		else 
		{
			int data;
			data=head.data;
			head=null;
			front++;
			return data;
		}
		
			
	}
	
	public int len()
	{
		return rear - front;
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
