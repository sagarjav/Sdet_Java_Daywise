package day05_Loops;

public class While_Loop_Demo {
	public static void main(String[] args) {
		//1.example print 1....10 numbers
		
		int i=1; //initialization
		
		while(i<=10) //condition
		{
			System.out.println(i);
			i++; //Increment
			
		}
		
		System.out.println("<--------SPACE -------->");
		
		
		//2.example print Hello 10 times
		
				int m=1; //initialization
				
				while(m<=10) //condition
				{
					System.out.println("Hello");
					m++; //Increment
					
				}
				
				System.out.println("<--------SPACE -------->");
				
		//3.print even number 1 to 10
				
				
               int j=2; //initialization
				
				while(j<=10) //condition
				{
					System.out.println(j);
					j+=2; //Increment
					
				}
				
				System.out.println("<--------SPACE -------->");
				
	   //4.print odd number 1 to 20
						
						
		               int k=1; //initialization
						
						while(k<=20) //condition
						{
							
							if(k%2==0) 
							{
								System.out.println(k);
								
							}
							else 
							{
								//System.out.println("odd number: "+k);
								
							}
							k++; //Increment
							
							
						}		
				
				
		
	}

}
