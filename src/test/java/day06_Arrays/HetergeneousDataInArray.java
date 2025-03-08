package day06_Arrays;

public class HetergeneousDataInArray {
	
	public static void main(String[] args) 
	{
		Object a[]= {  100, "SAGAR", 'G', 251, 125,"Selenium" };
		
		for(Object x:a)
		{
			System.out.println(x);
			
		}
		
		System.out.println("for loop data");
		
		for(int i=0; i<a.length; i++)
         {
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
