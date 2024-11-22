package day07;

import java.util.Arrays;

public class ArraySorting 
{
	
	public static void main(String[] args) 
	{
		
		
	   //1.sorting of array
		
		int a[]= {100,251,126,147,58,1569,456,147,58,58,58};
		
		for(int x:a) 
		{
			System.out.println(x);
			
		}
		
		
		System.out.println("<--------SPACE--------->");
		
	  //2.arrays to string 
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));  //look like ---> [100, 251, 126, 147, 58, 1569, 456, 147, 58, 58, 58]
		
		
		Arrays.sort(a);  //Ascending order-  sort element in ascending order
		System.out.println("Before sorting");
		
		System.out.println("Ascending order: "+Arrays.toString(a));
		
		//print arrays data in descending order
		System.out.println("Arrays data in Decending order: ");
		for(int i=a.length-1; i>=0; i--) 
		{
			System.out.print(a[i]+" ");
			
		}
	
    }
	
}
