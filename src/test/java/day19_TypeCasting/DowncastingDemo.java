package day19_TypeCasting;

//Downcasting means Parent---->child not possible but forcefully we can do


class parent1
{
	int a=100;
}

class child1 extends parent1
{
	String s="JAPAN";
}


public class DowncastingDemo 
{
  public static void main(String[] args) 
  {
	child1 c1=new child1();   //child object
	parent1 p1=new parent1(); //parent object
	parent1 upcasting=new child1();
	
	System.out.println(c1.a);
	System.out.println(c1.s);
	
	
	//downcasting   parent  store in child  --> we acces both class properties bu using downcasting
	//child1 c2=new parent1();  //not possible because parent is big and child is small so we need type casting
	//child1 d=(child1) parent1();
	
	child1 downcasting= (child1) upcasting;     //parent object first type casted to child1 then store in child. means reduce parent size then store to child
	System.out.println(downcasting.a);           //parent data
	System.out.println(downcasting.s);           //child data
	
	
  }
}
