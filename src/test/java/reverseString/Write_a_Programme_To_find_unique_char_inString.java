package reverseString;

import java.util.HashSet;

public class Write_a_Programme_To_find_unique_char_inString {

	public static void main(String[] args) 
	{
		String str="SAGAR";
		
		dublicate(str);

	}
	
	public static void dublicate(String dub) 
	{
		HashSet<Character> seen=new HashSet<>();
		HashSet<Character> Char_dub=new HashSet<>();
		
		char[] char_array=dub.toCharArray();
		
		for(char ch:char_array) 
		{
			if(!seen.add(ch))
			{
				Char_dub.add(ch);
			}
			
		}
		
			
		
		
		
		System.out.println("Dublicate character in Given string: "+Char_dub);
	}
	
	

}
