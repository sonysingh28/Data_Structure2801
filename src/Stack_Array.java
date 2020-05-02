
public class Stack_Array {

	
		int size;
		int a[];
		int top;
		Stack_Array(int size)

		{
			this.size=size;
			this.a= new int[size];
			this.top=-1;
			
		}
		public void push(int element)
		{
			if(!isFull())
			{top++;
			a[top]=element;
			System.out.println("Pushed Element:" + element);
			}
			else
			{
				System.out.println("Stack is full now");
			}
		}
		public int pop()
		{
			if(!isEmpty())
			{ int t= top;
			  top--;
			System.out.println("Popped Element:" + a[t]);
			return a[t];
			}
			else
			{
				System.out.println("Stack is Empty!!!");
				return -1;
			}
		}

		public int peek()
		{
			if(!this.isEmpty())
			{
				return a[top];
			}
			else 
			{
				System.out.println("Stack is empty");
				return -1;
			}
			
		}

		
		public boolean isEmpty()
		{
			return(top==-1);
		}
		
		
		public boolean isFull()
		{
			return(size-1==top);
		}//if size=7, then , top=7-1=6
		
		public static void main (String args[])
		{
			Stack_Array sny = new Stack_Array( 10);
			sny.pop();
			System.out.println("__________________");
			sny.push(100);
			sny.push(80);
			sny.push(90);
			sny.push(110);
			sny.push(78);
			sny.push(99);
			sny.push(150);
			System.out.println("__________________");
			System.out.print("Peek:");
			System.out.println(sny.peek());
			System.out.println("__________________");
			sny.pop();
			sny.pop();
			System.out.println(sny.isEmpty());
			System.out.println(sny.isFull());
		}

		
	}


