package day21_static_variable;

public class ZEmployeeUSE {

	public static void main(String[] args) 
	{
		ZEmployee e1=new ZEmployee();

		e1.empID=25;
		e1.empName="Sujata";
		e1.CEOName="SAGAR";
		e1.setInfo();
		
		ZEmployee e2=new ZEmployee();

		e2.empID=30;
		e2.empName="Kanchan";
		//e2.CEOName="SHWEtA";
		e2.setInfo();
		
	}

}
