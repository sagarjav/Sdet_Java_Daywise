package abstractClassConcept;

public class Bike extends Vehicle
{

	@Override
	public void speed() 
	{
		
		System.out.println("Speed of Bike is 200km/hr");
	}
	
	public static void main(String[] args) 
	{
		Bike bk=new Bike();
		//bk.tyre();
		bk.speed();
	}

	
	
	
	
}
