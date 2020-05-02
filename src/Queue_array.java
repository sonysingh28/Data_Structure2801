
public class Queue_array 
{
   int capacity;
   int quearr[];
   int front;
   int rear;
   int current_size;
   
   
  public Queue_array(int size_queue)
   {
	  this.capacity= size_queue;
	  front=0;
	  rear=-1;
	  quearr = new int[this.capacity];
    }
	
  
	public boolean isFull()
	{
	  {
		if(current_size==capacity)
			return true;
	  }
	 return false;
		
   }
	
	
	public boolean isEmpty()
	{
	  {
		if(current_size==0)
			return true;
	  }
	 return false;
		
   }
	
  //This method is used to add element in the queue!!!
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full,cannot insert data into it!!!)");
		}
		else
		{
			rear++;
			if(rear==capacity-1)
			{
				rear=0;
			}
		quearr[rear]=data;
		current_size++;
		System.out.println(data + "___added to the queue");
			
		}}
		
	   //This method is used to remove element in the queue!!!
		public void Dequeue()
		{
			if(isEmpty())
			{
				System.out.println("Queue is emepty,cannot delete/dequeue data !!!)");
			}
			else
			{
				front++;
				if(front==capacity-1)
				{
					System.out.println(quearr[front-1] + " is removed from the queue");
				    front=0;

				}
			  else
			  {
				System.out.println(quearr[front-1] + " is removed from the queue");

			   }
	        current_size--;
			}
	     }
	public static void main(String args[])
	{
		Queue_array a= new Queue_array(10);
		a.enqueue(8);
		a.enqueue(11);
		a.enqueue(90);
		
		a.Dequeue();
		
		a.enqueue(28);
		a.enqueue(89);
		a.enqueue(30);


		a.Dequeue();
		
		
		
	}
	
	
}
