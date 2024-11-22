package day07;

public class FindNumerOfRepetitions 
{

	
	
	public static void main(String[] args) 
	{
		int a[]= {100,251,126,147,58,1569,456,147,58,58,58};
		
		//Find number of repetitions
		int num=58;
		int count=0;
		for(int x:a) 
		{
			if(x==num)
			{
				count++;
			}
		}
		
		System.out.println("number of times value is: "+count);
		
		
		
	}
}
