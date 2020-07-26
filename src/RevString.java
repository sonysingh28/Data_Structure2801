import java.util.*;
public class RevString 
{

	public static void main(String[] args) 
	{
		String in = "Geeks for Geeks";
		
		char ch[] = in.toCharArray();
		
		List<Character> l = new ArrayList<>();
		
		for(char c:l)
		{
		   l.add(c);
		}
		
		Collections.reverse(l);
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext())
		{
			
			System.out.println(li.next());
		}
		
		

	}

}
