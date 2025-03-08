package day19_TypeCasting;

//Upcasting means child---->parent possible

 class parent
 
{
	int a=10;
}

 class child extends parent
 {
	 String s="SAGAR";
 }


public class TypeCastingobjects 
{
   public static void main(String[] args) 
   {
	   child c=new child();    //we can acces both class properties
	  System.out.println(c.a);
	  System.out.println(c.s);
	  
	  parent p=new child();      //we can access only parent class properties   //this is Upcasting
	  System.out.println(p.a);
	  
	   
	   
   }
}
