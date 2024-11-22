package day04;

public class If_LoopStatementDemo {
	
	
	public static void main(String[] args) 
	{
		

		int a=1213;
		
		if(a>0) 
		{		
				if (a%2==0) 
				{
					System.out.println("Given numer is Even number: "+a);
				}
				else 
				{
					System.out.println("Given numer is odd number: "+a);
				}
		}
		
		else 
		{
			System.out.println("given number is negative: "+a);
		}

  }
}
