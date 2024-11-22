package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ReadandWritedataInArray {
	
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		
		
		Scanner sc=new Scanner(System.in);
		
	
		for(int i=0; i<a.length; i++) 
		{
			System.out.println("Please Enter your number:");
		   a[i]=sc.nextInt();
		
		}
		
		System.out.println("Entered Array is: "+Arrays.toString(a));
		
	}

}
