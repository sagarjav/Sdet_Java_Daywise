package day10;

public class Employee 
{
	//Variables
	int eid;
	String ename;
	String job;
	int sal;
	
	
	//Methods-----> always mention method is return or not like void or return any thing String int .....
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
		
	}
	
	public static void main(String[] args) 
	{
		Employee emp1=new Employee(); //object creation
		emp1.eid=101;
		emp1.ename="john";
		emp1.job="manager";
		emp1.sal=10000;
		emp1.display();
		
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="tina";
		emp2.job="design";
		emp2.sal=20000;
		emp2.display();
		
	}
	
	

}
