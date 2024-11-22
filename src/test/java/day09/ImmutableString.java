package day09;

import java.util.Arrays;

public class ImmutableString {
	public static void main(String[] args) 
	{
		//mutable --->we can change
		int a[]= {100,250,6441,259,145};
		System.out.print(Arrays.toString(a)); //[100, 250, 6441, 259, 145]
		System.out.println();
		Arrays.sort(a); //mutable---> we can change
		System.out.println(Arrays.toString(a)); //[100, 145, 250, 259, 6441]
		
		
		//immutable----> we can not change
		String s="java is nice language";
		
		System.out.println(s); //java is nice language
		System.out.println(s.concat("japan"));
		System.out.println(s); //immutable -->we cannot change   java is nice language
		
		
		
	}

}
