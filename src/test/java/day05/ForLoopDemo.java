package day05;

public class ForLoopDemo {
	
	
	
	public static void main(String[] args) {
		
		
		//1.print 1 to 10 numbers
		for(int i=1; i<=10; i++)  //initialization condition increment/Decrement
		
		{
			System.out.println(i);
			System.out.println(i);
			
			
		}
		
		System.out.println("<--------space--------->");
		
		//2.print even number 1 to 20
		
				for(int i=1; i<=20; i++)  //initialization condition increment/Decrement
				
				{
					if(i%2==0)
					{
					System.out.println("even numbers: "+i+"  remainder: "+(i%2));
					
					}
					else 
					{
						System.out.println("Odd numbers: "+i+"  remainder: "+(i%2));
					}
					
					
				}
				
				System.out.println("<--------space--------->");
		
		
		
		
		
		
		
	}

}
