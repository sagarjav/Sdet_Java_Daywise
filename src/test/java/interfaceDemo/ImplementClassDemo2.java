package interfaceDemo;

public class ImplementClassDemo2 implements Demo 
{

	
	
	public static void main(String[] args) 
	{
		ImplementClassDemo2 im2=new ImplementClassDemo2();
		im2.m1();
		im2.m2();
		im2.m3();

	}

	@Override
	public void m1() {
		System.out.println("method is running in implement class Demo 2 and method m1");
		
	}

	@Override
	public void m2() 
	{
		
		System.out.println("method is running in implement class Demo 2 and method m2");
	}
	
	public void m3() 
	{
		System.out.println("method is running in implement class Demo 2 and method m3");
	}

}
