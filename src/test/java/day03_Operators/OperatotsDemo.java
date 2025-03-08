package day03_Operators;

public class OperatotsDemo 
{
	public static void main(String[] args) {
		
	
			//1. arithmetic operators 
			int a=10, b=21;
			
			System.out.println("Sum of a and b is: "+ (a+b));
			System.out.println("diff of a and b is: "+ (a-b));
			System.out.println("Mul of a and b is: "+ (a*b));
			System.out.println("divide of a and b is: "+ (a/b));
			System.out.println("remainder of a and b is: "+ (b%a)); //remainder gives when use % 
		
			System.out.println("<------   Space ------->");
			
			//2. Relational  operators /comparison operators > >= < <+ != ==
			//returns boolean values -true/false
			System.out.println(a<b); //true
			System.out.println(a>b); //false
			System.out.println(a<=b); //true
			System.out.println(a>=b); //false
			
			System.out.println("<------   Space ------->");
			
			
			//3 Logical operators && || !
			//works between two boolean values
			//returns boolean values -true/false
			boolean x=true;
			boolean y=false;
			System.out.println(x && y); //false
			System.out.println(x || y); //true
			System.out.println(!x); //false
			System.out.println(!y); //true
			
			
			
			
			
			
			
			
	
	}
	
	

}
