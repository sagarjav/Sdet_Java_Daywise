package reverseString;

public class UniqueLetterCountFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SAGAARS";
		String uniqueChars="";
		String notUniquechars="";
		
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			//System.out.println( uniqueChars.indexOf(ch));
			
			if(uniqueChars.indexOf(ch)==-1)
			{
				uniqueChars=uniqueChars+ch;
			}  
			
			else 
			{
				notUniquechars=notUniquechars+ch;
			}
			
		}
		
		
		
		System.out.println("Unique characters: "+uniqueChars);
		System.out.println("Not Unique characters: "+notUniquechars);
		

	}

}
