package day08_String_Methods;

public class StringsMethods {
	
	
	public static void main(String[] args)
	{
		
		String s="welcome";   //1 method
		
		//String j=new String("welcome");   //2 method
		
		System.out.println(s);
		
		//length of string 
		s.length();
		System.out.println(s.length());  //7
		System.out.println("welcome".length()); //7
		
		
		//concat() method use- joining string
		String s1="SAGAR";
		String s2="BANKAR";
		
		System.out.println(s1.concat(s2));//SAGARBANKAR
		System.out.println(s1+s2);         //SAGARBANKAR
		System.out.println(s1+s2.concat(s));         //SAGARBANKARwelcome
		
		//trim- remove space right and left side
		s="  welcome  ";
		
		System.out.println(s); //print string along with space    "  welcome  "
		System.out.println("before string space remove: "+s.trim()); //remove string left side space "welcome  "
		System.out.println("After string space remove: "+s.trim().length()); 
		
		
		//charAt()- returns a character from a string based on index
		//index start from 0
		s="welcome";
		System.out.println(s);
		System.out.println(s.charAt(5)); //m
		System.out.println(s.charAt(2)); //l
		
		//contains()--> returns always true or false 
		
		s="welcome";
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("cm")); //false
		
		
		//equals(),   equalIsIgnoreCase()------> compare strings
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase("WelCOME"));//true
		
		//replace()---> replace single or multiple (sequence) of character
		s="$12,5,21,5";
		System.out.println(s.replace("$", "")); //125,215
		System.out.println(s.replace(",", "")); //$125,215
		System.out.println(s.replace("$", "").replace(",", ""));//125215
		
		
		//substring()---->
		s="welcome";
		System.out.println(s.substring(1, 4)); //elc
		System.out.println(s.substring(2)); //lcome
		System.out.println(s.subSequence(2, 4));
		
		//split()---->split the string into multiple parts based on delimeter
		s="abc@gmail.com";
		String arr[]=s.split("@");      //arr[]=arr[0]=abc ,arr[1]=gmail.com
		System.out.println(arr[0]);//abc
		System.out.println(arr[1]);//gmail.com
		
		
		
		
		
	}

}
