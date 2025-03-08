package day18_ExceptionHandeling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
     System.out.println("program is started....");
		
		Scanner sc=new Scanner(System.in);
		
		//Exp 1
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num);   //Arithmetic exception
		}
		catch(Exception e)
		{
			System.out.println("Invalid Data ...."+e);
		}
		System.out.println("Programm is completed ....");
		System.out.println("Programm is exited ....");
		
	}
}
