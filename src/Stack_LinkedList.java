
public class Stack_LinkedList {

	Node head;

	class Node
	{
		int val;
		Node next;
		
	}
	
	Stack_LinkedList()
	{
	   head= null;
	   
	}
	
	public void push(int val)
	{
		Node e_head= head;
		head  = new Node();
		head.val= val;
		head.next=e_head;
	}
	
	public int pop()
	{
		if(head==null)
		{ 
			System.out.println("Your stack is empty!!!");
			return 0;
	
	     }
		else
		{
			int val= head.val;
			head= head.next;
			return val;
			
			}
		}
	public static void printList(Node head)
	{
		Node tmp = head;
		while(tmp!=null)
		{
			System.out.println(tmp.val + " ");
			tmp=tmp.next;
			
		}		
	}
	public static void main (String args[])
	{
		Stack_LinkedList ls = new Stack_LinkedList();
		System.out.println((ls.pop()));
		/*System.out.println("Push linked list in the stack::");
		System.out.println("__________________");*/
		ls.push(50);
		ls.push(29);
		ls.push(16);
		ls.push(42);
		System.out.println("Pop linked list in the stack::"+ls.pop());
		ls.push(54);
		System.out.println("Pop linked list in the stack::"+ls.pop());
		printList(ls.head);


	}
}
