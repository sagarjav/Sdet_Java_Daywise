package day09;

public class Stringcomparison {
	public static void main(String[] args) {
		
			//case 1 -----> string literal      
			String s1="welcome";
			String s2="welcome";
			
			System.out.println(s1==s2);       //true
			System.out.println(s1.equals(s2)); //true
			
			//case 2  string objects---> objects create ---with help of 'new' keyword
			String s3=new String("welcome");
			String s4=new String("welcome");
			
			System.out.println(s3==s4);//false  compare the objects
			
			System.out.println(s3.equals(s4)); //true // compare the values of objects
			
			//case 3
			String s5="abc";
			String sd=new String("abc");
			
			System.out.println(s5==sd); //location is different-->false
			System.out.println(s5.equals(sd));//content is same-->true
			
			//case 4
			String s6="abc";
			String s7=new String ("abc");
			
			
			
			
			
			
	
	
	}

}
