package day15;

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
