package day17;

public class DataConversionMethods 
{
	public static void main(String[] args) 
	{
		
		//String------>int
		String s="welcome";
		
		
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		//String---->double
		String s3="10.5";
		String s4="20.0";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		//String ---->boolean
		String s5="WELCOME"; //other than true, if you pass any String that will return false
		System.out.println(Boolean.parseBoolean(s5));
		
		//String ---> not possible
		
		
		//int, double , boolean, char---->String
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String g=String.valueOf(a);
		System.out.println(g);
		
		
		
	}

}
