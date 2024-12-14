package reverseString;

public class ReverseString {
	
	public static void main(String[] args) 
	{
		String str="";
		String s="welcome";
		
		for(int i=0; i<s.length(); i++)
		{
			 str=s.charAt(i)+str;
		}
		
		System.out.println(str);
	}

}
