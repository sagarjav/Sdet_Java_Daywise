package day04;

public class If_ElseIf_elseDemo
{
	public static void main(String[] args) 
	{
		
	
	int age=-15;
	
	if(age>18)
	{
		System.out.println("person is eligible to vote: "+age);
	}
	
	else if(age<0)
	{
		System.out.println("Data is wrong: "+age);
	}
	
	else 
	{
		System.out.println("person is not eligible to vote: "+age);
	}

	}
}
