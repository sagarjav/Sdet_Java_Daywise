package day18_ExceptionHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	public static void main(String[] args) throws InterruptedException   
	{
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Programm is completed ....");
		
		
		try 
		{
		FileInputStream file= new FileInputStream("img.txt");     //FileNotFoundException
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("FileNotFoundException is shown...."+e.getMessage());
		}
		try
		{
		Thread.sleep(5000);      //InterruptedException
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException is showing..."+e.getMessage());
		}
		
		System.out.println("Programm is exited ....");
		
		Thread.sleep(5000);        //InterruptedException
		
		System.out.println("Programm is end ....");
		
	}

}
