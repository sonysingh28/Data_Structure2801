import java.util.*;
public class CountChar 
{

	public static void main(String[] args) 
	{
		
		String str;
		System.out.print("Plese enter the expression::");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		s.close();

		System.out.print("Occurence");
		
		charccount(str);


       // String str;
        //charccount("Sony Singh");
	
	}
	 
	
	public static void charccount(String str)
	{
		
		HashMap<Character,Integer> ccmap = new HashMap<Character,Integer>();
		
		//Converting given string to char array
		char[] ch = str. toCharArray();
	
		//Checking each char for c
		
		for(char c : ch)
		{
			if(ccmap.containsKey(c))
			{
				ccmap.put(c,ccmap.get(c)+1);
			}
			
			else
			{
				ccmap.put(c,1);
			}
		}
		  for(Map.Entry entry : ccmap.entrySet())
         {               
        	 System.out.println(entry.getKey() + " = " + entry.getValue());
         } 
		
		
		
	}

}
