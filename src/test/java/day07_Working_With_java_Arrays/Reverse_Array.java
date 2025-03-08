package day07_Working_With_java_Arrays;

import java.util.Arrays;

public class Reverse_Array {
	
	
	public static void main(String[] args) {
		//1.sorting of array
		
				int a[]= {100,251,126,147,58,1569,456,147,58,58,58};
				Arrays.sort(a);  //make array in Ascending order
				
				//print arrays data in descending order
				System.out.println("Arrays data in Decending order: ");
				for(int i=a.length-1; i>=0; i--) 
				{
					System.out.print(a[i]+" ");
					
				}
	}

}
