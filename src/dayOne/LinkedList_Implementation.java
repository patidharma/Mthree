package dayOne;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class LinkedList 
{
	Node head=null;
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		Node current=head;
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	public void printList()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public void addFirst(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;

	}
	public void delete(int data)
	{
		Node current=head;
		
		while(current.next != null && current.next.data != data)
		{
			current=current.next;
		}
		current.next=current.next.next;
	}
}


public class LinkedList_Implementation
{
	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.printList();
		
		list.addFirst(10);
		
		list.printList();
		
		list.delete(20);
		
		list.printList();
	}

}
