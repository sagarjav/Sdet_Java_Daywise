package abstractClassConcept;

public class Car extends Vehicle {

	
	
	public static void main(String[] args) 
	{
		Car cr=new Car();
		cr.speed();
		//cr.tyre();
		

	}

	@Override
	public void speed() {
		System.out.println("Speed of car is: 120km/hr");
		
	}

}
