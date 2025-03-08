package reverseString;

import java.util.HashSet;

public class Write_a_program_to_find_duplicates_in_an_array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,5,4,1,3,5,9,6,8,7};
		
		findDublicates(numbers);

	}
	
	public static void findDublicates(int [] array) 
	{
		
		HashSet<Integer> seen= new HashSet<Integer>();
		HashSet<Integer> dublicate= new HashSet<Integer>();
		
		for(int num:array)
		{
			
			if(!seen.add(num))
			{
				dublicate.add(num);
			}
			
		}
		
		System.out.println("Dublicate element: "+dublicate);
		
	}

}
