package day16_Data_abstraction_Interface;

public interface Shape {
	
	int length=10; //final and static
	int width=20; //final and static
	
	void circle() ;   //abstract method
	
	default void square() 
	{
		System.out.println("this is default method");
	}
	
	
	static void reactangle() 
	{
		System.out.println("this is reactangle method : static method");
	}
	
	
	

}
