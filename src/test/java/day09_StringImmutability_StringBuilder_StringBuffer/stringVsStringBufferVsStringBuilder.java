package day09_StringImmutability_StringBuilder_StringBuffer;

public class stringVsStringBufferVsStringBuilder {
	public static void main(String[] args) 
	{
		//String immutable----> we can not change
				String s="java is nice language";
				
				System.out.println(s); //java is nice language
				System.out.println(s.concat("japan"));
				System.out.println(s); //immutable -->we cannot change   java is nice language
				
				
	    //StringBuilder---->mutable we can change the value of stringBuilder
				StringBuilder sd=new StringBuilder("hello welcome to japan");
			    System.out.println(sd);  //before change-->hello welcome to japan
				System.out.println(sd.append("java"));
			    System.out.println(sd);  //after change--->hello welcome to japanjava
		
	}

}
