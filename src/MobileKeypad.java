import java.util.*;
public class MobileKeypad 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String phone = "123";
        List<String> combos = lettercom(phone);
        System.out.print("Combination is: ");

        for (String s : combos) 
        {
            System.out.print(s +",");
        }


	}
	
	public static ArrayList<String> lettercom(String digits)
	{
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<String> preres = new ArrayList<String>();
		res.add("");
		int i,j,l;
		l = digits.length();
		
		for(i=0;i<l;i++)
		{
			String letters = map.get(digits.charAt(i));
			int lt = letters.length();
			if(letters.length()==0)
				continue;
			for(String str : res)
			{
				for(j=0;j<lt;j++)
					preres.add(str + letters.charAt(j));
			}
			res = preres;
			preres = new ArrayList<String>();
		}	
		
		return res;
		
	}
	
	 static final HashMap<Character,String> map = new HashMap<Character,String>()
			 {{
				 put('1',"");
				 put('2',"abc");
				 put('3',"def");
				 put('4',"ghi");
				 put('5',"jkl");
				 put('6',"mno");
				 put('7',"pqrs");
				 put('8',"tuv");
				 put('9',"wxyz");
				 put('0',"");	  
			 }};

   }
