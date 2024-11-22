package day11;

public class Student {
	
	int Sid;
	String name;
	char grade;
	
	void print_StudData() {
		
		
		System.out.println(Sid+" "+name+" "+grade);
	}
	
	
	void set_StudData(int id,String sname, char gr){
		
		Sid=id;
		name=sname;
		grade=gr;
		
	}
	
	
	
	Student (int id,String sname, char gr)
	{
		Sid=id;
		name=sname;
		grade=gr;
		
		
	} 
		
	
	
	
	
	
	

}
