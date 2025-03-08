package reverseString;

public class Write_a_programme_to_find_unique_char_in_String {

	public static void main(String[] args) 
	{
		String str="SAGAR";
		//String str=str1.replaceAll("[^a-zA-Z0-9]", "");
		String empty="";
		String dub_char="";
		
		
		char[] array=str.toCharArray();
		
		for(char ch:array) 
		{
			if(empty.indexOf(ch)==-1) 
			{
				empty=empty+ch;
			}
			else {
				dub_char=dub_char+ch;
			}
			
		}
		
		
		
			System.out.println("unique character in string: "+empty.replaceAll(dub_char,"" ));
		
		System.out.println("Unique char in string: "+empty);
		System.out.println("Dublicate char in string: "+dub_char);
		

	}

}
