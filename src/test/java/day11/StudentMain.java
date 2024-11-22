package day11;

public class StudentMain {

	public static void main(String[] args) 
	{
		/*
		Student stu=new Student();
		
		//1.using objects reference variable
		stu.Sid=101;
		stu.name="sagar";
		stu.grade='A';
		
		stu.print_StudData();
		
		//2.using Method
		stu.set_StudData(101, "sagar", 'A');
		stu.print_StudData();
		*/

		
		//3.using constructor
		Student sta=new Student(102,"Saniya",'B');
		sta.print_StudData();
	}

}
