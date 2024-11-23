package day18;

import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) throws ArithmeticException 
	{
      System.out.println("program is started....");
		
		Scanner sc=new Scanner(System.in);
		
		//Exp 1
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num);   //Arithmetic exception
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Invalid Data ...."+e);
		}
		
		catch(ArithmeticException e)        //only this catch block will execute
		{
			System.out.println("Invalid Data ArithmeticException ...."+e);
			System.out.println("Invalid Data ArithmeticException ...."+e.getMessage());
		}
		
		
		catch(Exception e)    //this always execute 
		{
			System.out.println("Invalid Data Exception...."+e.getMessage());
		}
		
		finally
		{
			System.out.println("You entered into finally block ....");
		}
		
		System.out.println("Programm is completed ....");
		System.out.println("Programm is exited ....");
		
		
		
		
	}

}
