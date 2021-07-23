import java.util.*;
public class SubList {

	public static void main(String[] args) 
	{
      
	     String str = "sonywalmartsony";
	     
	     Set<Character> set = new HashSet<Character>();
	     
	     char ch[] = str.toCharArray();
	     
	     for(char c : ch)

	     {
	    	 set.add(c);
	     }
	     
	     
	     Iterator t = set.iterator();
	     
	     
	     while(t.hasNext())
	    	 
	     {
	    	 System.out.print(t.next());
	     }
		
		
	}

}
