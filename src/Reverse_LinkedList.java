 class Reverse_LinkedList 
{
	static Node head;
	
	static class Node
 {
		int data;
	    Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
  }
	
    Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
	   while(current!= null)
	   {
		   next = current.next;
		   current.next= prev;
		   prev= current;
		   current= next;   
	   }
	    node = prev;
	    return node;
	  }
	
	
	void printlist(Node node)
	{
		while(node!= null)
		{
			System.out.println(node.data + "");
		   node= node.next;
	    }
	}		
		
	
	public static void main(String[] args) 
	{
		Reverse_LinkedList l = new Reverse_LinkedList();
		l.head= new Node(85);
		l.head.next= new Node(15);
		l.head.next.next= new Node(4);
		l.head.next.next.next= new Node(20);
		
       System.out.println("The given Linked List is:");
       l.printlist(head);
       head= l.reverse(head);
       System.out.println("Reverse Linked List is :");
       l.printlist(head);
       
       
	}

}
