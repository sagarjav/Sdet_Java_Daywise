package day15_Method_Overloading_final_Keyword_Super_keyword;

public class Biker extends Vehicle {
	
	public void run ()
	{
		System.out.println("Bike is running safely");
	}

	
	
	public static void main(String[] args) 
	{
		Biker bi=new Biker();
		
		bi.run();
		
		
	}
}
