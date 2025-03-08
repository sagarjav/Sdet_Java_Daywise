package day16_Data_abstraction_Interface;

public class InterfaceDemo implements Shape {
	
	
	public void circle() 
	{
		System.out.println("this is circle -abstact method");
	}
	
	
	
	 void triangle() 
	{
		System.out.println("this is triangle..... ");
	}
	
	 
	 
	 
	 public static void main(String[] args) 
	 {
		//case 1
		 InterfaceDemo id=new InterfaceDemo();
		 id.circle(); //abstract method
		 id.triangle(); 
		 id.square();
		 id.circle();
		 Shape.reactangle(); //static method can directly access from interface
		 
		 System.out.println("<------   space  ------->");
		 
		 //case2
		 Shape sh=new InterfaceDemo();
		 sh.circle();
		 sh.square();
		 Shape.reactangle();
		// sh.triangle(); // we cannot access this 
		 System.out.println(Shape.length*Shape.width);
		 
		
	}

}
