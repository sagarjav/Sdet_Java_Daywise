package day07_Working_With_java_Arrays;

public class SearchElementInArray {
	
	public static void main(String[] args) 
	{
		
	
	//1.search element in array (linear search)
	
	int a[]= {100,251,126,147,58,1569,456,147,58,58,58};
	
	System.out.println("length of array is: "+a.length);
	//1.search 147 is present or not
	
	int search_element=147;
	boolean status=false;  //false -not found   true-found
			for(int i=0; i<a.length; i++) 
			{
					if(a[i]==search_element) 
					{
						System.out.println("Element found: "+a[i]);
						status=true;
						break;
					}
				
			}
			
			if(status==false) 
			{
			System.out.println("not found");
			}
	      
	//2.Find number of repetitions
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
