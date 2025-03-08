package day10_OOPS_Concept;

public class EmployeeMain 
{

	
	public static void main(String[] args) 
	{
		Employee emp1=new Employee(); //object creation
		emp1.eid=101;
		emp1.ename="john";
		emp1.job="manager";
		emp1.sal=10000;
		emp1.display();
		
		System.out.println("<--------SPACE------->");
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="tina";
		emp2.job="design";
		emp2.sal=20000;
		emp2.display();
		
	}
}
