package day16_Data_abstraction_Interface;

public class C1 implements I1,I2 
{
	   public void m1() 
		{
			System.out.println(x);
		}
	   
	   
	   public void m2() 
		{
			System.out.println(y);
		}
	   
	   public static void main(String[] args) 
	   {
		 C1 MB=new C1();
		 MB.m1();
		 MB.m2();
		 
		 
	   }
	   
	   
}
