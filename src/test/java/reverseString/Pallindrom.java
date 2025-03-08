package reverseString;

public class Pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mada";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev)) 
		{
			System.out.println("given string is pallindrom"+" original String:"+s+"pallindrom string:"+rev);
		}
		else 
		{
			System.out.println("given string is not pallindrom"+" original String:"+s+"pallindrom string:"+rev);
		}

	}

}
