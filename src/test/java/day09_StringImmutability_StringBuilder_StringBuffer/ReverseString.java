package day09_StringImmutability_StringBuilder_StringBuffer;

public class ReverseString {
	public static void main(String[] args) 
	{
		String s="welcome";
		//approach 1
		String rev="";
		for(int i=s.length()-1; i>=0; i--) 
		{
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println("given string: "+s);
		System.out.println("Reverse string: "+rev);
		
		//approach 2 ----> without using string method
		String s1=" Japan";
		String rev2="";
		
		char a[]=s1.toCharArray();
		
		for(int i=a.length-1; i>=0; i--) 
		{
			
			rev2=rev2+a[i];
			
		}
		System.out.println("Reverse of Japan: "+rev2);
		
		
		//approach 3 stringBuffer     ---> reverse method available in StringBuffer and StringBuilder class
		StringBuffer k=new StringBuffer("welcome");
		System.out.println("Reverse of welcome: "+k.reverse());  //emoclew
		
		
		StringBuilder J=new StringBuilder("welcome");
		System.out.println("Reverse of welcome: "+J.reverse());  //emoclew
		
		
		
	}

}
