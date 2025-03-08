package day07_Working_With_java_Arrays;

import java.util.Scanner;

public class TakingMultipleInputFromKeybord {
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name: ");
		String num1=sc.next();
		
		System.out.println("Enter Last Name: ");
		String num2=sc.next();
		
		System.out.println("Enter city: ");
		String num3=sc.next();
		
		
		System.out.println("your entered data is: "+num1+" "+num2+" "+num3);
		
		
	}

}
