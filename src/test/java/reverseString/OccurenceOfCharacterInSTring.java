package reverseString;

public class OccurenceOfCharacterInSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcabfrgbbbbhaabcgth";
		char target_a='a';
		char target_b='b';
		int Count_a=0;
		int Count_b=0;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			if(s.charAt(i)==target_a ) 
			{
				Count_a++;
			}
			else if(s.charAt(i)==target_b)
			{
				 Count_b++;
			}
		}
		
		System.out.println("a is count:"+Count_a);
		System.out.println("b is count:"+Count_b);

	}

}
