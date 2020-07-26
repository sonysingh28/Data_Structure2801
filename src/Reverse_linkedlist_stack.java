import java.util.*;
public class Reverse_linkedlist_stack 
{

	static class Node
	{
		int data;
		Node next;
		
	}
	static Node head = null;
	static void push(int new_data)
	{
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = (head);
		(head) = new_node;
	}
	
	static Node reverseList(Node head)
	{
		Stack<Node> s = new Stack<Node> ();
		Node ptr = head;
		while(ptr.next != null)
		{
			s.push(ptr);
			ptr= ptr.next;
		}
		head = ptr;
		while(! s.isEmpty())
		{
			ptr.next = s.peek();
			ptr= ptr.next;
			s.pop();
		}
		ptr.next = null;
		return head;
	}
	
	
	static void printList(Node head)
	{
		while(head!= null)
		{
			System.out.println(head.data + "");
			head= head.next;
		}
	}
	

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		
		head = reverseList(head);
		printList(head);


	}

}
