import java.util.*;
public class Express_Checl 
{

	public static void main(String[] args) 
	{
		boolean result = exp_check("(()){[]");	
        System.out.print("Result of the expression check is::"+result);
	}
	
	
	
	public static boolean exp_check(String s)
	{
		
		Stack<Character> stack= new Stack<Character>();
		int i, l;
		l = s.length();
		for(i=0;i<l;i++)
		{
			char ch = s.charAt(i);
			if((ch=='('||ch=='{'||ch=='['))
			{
				stack.push(ch);
			}
			else if ((ch==']'))
			{
				if(stack.isEmpty()|| stack.pop() != '[')
				{
					return false;
				}
			}
			
			else if ((ch=='}'))
			{
				if(stack.isEmpty()|| stack.pop() != '{')
				{
					return false;
				}	
			}
			
			else if ((ch==')'))
			{
				if(stack.isEmpty()|| stack.pop() !='(')
				{
					return false;
				}
			}
		}		
		return stack.isEmpty();
	}

}
