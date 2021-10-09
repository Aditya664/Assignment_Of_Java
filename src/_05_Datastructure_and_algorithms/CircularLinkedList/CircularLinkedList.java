package CircularLinkedList;

import CircularLinkedList.Node;

public class CircularLinkedList 
{
	Node head;
	
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.prev=null;
		node.next=null;
		if(head==null)
		{
			head=node;
			head.next=head.prev;
		}
		else 
		{
			Node temp;
			temp=head;
			if(temp.next==null)
			{
				temp.next=node;
				node.prev=temp;
				node.next=temp;
				temp.prev=node;
			}
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=node;
			node.prev=temp;
			node.next=head;
			head.prev=node;
		}
	}
	
	public void show()
	{
		System.out.println();
		if(head==null)
		{
			System.out.println("No data found");
		}
		else 
		{
			Node temp;
			temp=head;
			if(temp.next!=null)
			{
				while(temp.next!=head)
				{
					System.out.print(temp.data);
					System.out.print(" <--> ");
					temp=temp.next;
				}
				System.out.print(temp.data);
			}
			else 
			{
				System.out.println(temp.data);
			}
		}
	}
	
	public void insertAt(int index,int data)
	{
		if(index>len())
		{
			System.out.println("Index not found");
		}
		else 
		{
			try 
			{
				
				Node node=new Node();
				node.data=data;
				if(head.next==null)
				{
					head.next=node;
					node.prev=head;
					node.next=head;
					head.prev=node;
				}
				else 
				{
					if(index==1)
					{
						node.prev=head.prev;
						node.next=head;
						head.prev=node;
						node.prev.next=node;
						head=node;
					}
					else 
					{
						Node temp;
						temp=head;
						for(int i=1;i<index-1;i++)
						{
							temp=temp.next; 
						}
						
						node.prev=temp;
						node.next=temp.next;
						temp.next=node;
						node.next.prev=node;
					}	
				}
				
			} catch (Exception e) 
			{
				System.out.println("\nIndex not found");
			}
		}
		
	}
	
	public int len()
	{
		if(head==null)
		{
			return 0;
		}
		try 
		{
			Node temp=head;
			int count=1;
			while(temp.next!=head)
			{
				count++;
				temp=temp.next;
			}
			return count;
		} catch (Exception e) 
		{
			return 1;
		}
	}
	
	public boolean isFound(int data)
	{
		Node temp;
		temp=head;
		boolean found=false;
		if(temp==null)
		{
			return found;
		}
		if(temp.data==data)
		{
			found=true;
			return found;
		}
		while(temp.next!=head)
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
	
	public void delete()
	{
		try 
		{
			if(head.next==null)
			{
				head=null;
			}
			else if(head.next.next==head)
			{
				head.next=null;
				head.prev=null;
			}
			else
			{
				Node temp;
				temp=head;
				while(temp.next!=head)
				{
					temp=temp.next;
				}
				temp.prev.next=head;
				head.prev=temp.prev;
			}
		} catch (Exception e) 
		{
			System.out.println("\nNo Data to Delete");
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==1)
		{											
			Node temp;
			temp=head;
			head=temp.next;
			temp.prev.next=head;
			head.prev=temp.prev;
		}
		else
		{
			Node temp;
			temp=head;
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
	}
	
}
