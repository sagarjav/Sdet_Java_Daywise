package interfaceDemo;

public class ImplementClassDemo1 implements Demo
{

	static int b;
	@Override
	public void m1() {
		System.out.println("method is running in implement class m1");
		
	}

	@Override
	public void m2() {
		System.out.println("method is running in implement class:m2");
		
	}
	
	public void m3() 
	{
		System.out.println("print interface data member:"+b);
	}
	
	public static void main(String[] args) 
	{
		  
		ImplementClassDemo1 im=new ImplementClassDemo1();
		im.m1();
		im.m2();
		b=im.a;
		
	}
	
	

}
