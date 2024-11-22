package day13;

public class thiskeyword 
{
	int x,y;   //class variable or instance variable
	
	thiskeyword (int a,int b)   //local variable 
	{
		x=a;
		y=b;
	}
	
	/* thiskeyword(int x,int y)   //local variable 
	{
		x=x;          //Logical error
		y=y;          //Logical error
	} 
	
	thiskeyword (int x,int y)   //local variable 
	{
		this.x=x;
		this.y=y;
	}*/
	
	void display() 
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		thiskeyword th=new thiskeyword(100,200);
		
		th.display();
		
	}
	

}
