package day04_Control_Statement;

public class SwitchCaseStatement 
{
    public static void main(String[] args) {
		
	String name="sat";
	
	switch(name.toLowerCase())
	{
	
	case "sunday": System.out.println("Today is sunday:"+name);break;
	case "monday": System.out.println("Today is monday:"+name);break;
	case "tuesday": System.out.println("Today is tuesday:"+name);break;
	case "wed": System.out.println("Today is wed:"+name);break;
	case "Thursday": System.out.println("Today is Thursday:"+name);break;
	case "friday": System.out.println("Today is friday:"+name);break;
	case "sat": System.out.println("Today is sat:"+name);break;
	default: System.out.println("you enter wrong value"); break;
	
	
	
	
	
	}
	
	
    }
}
