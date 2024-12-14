package reverseString;

public class OddEvenNumberFind 
{

	public static void main(String[] args) 
	{
		String even="";
		int evencount=0;
		int oddcount=0;
		String odd="";
		
		//odd and even number programme
		     int a[]={10,5,36,14,25};
		     for(int X:a)
		     { 
				        //even divide by 2 remainder is 0
				        //odd divide by 2 remainder is not zero
				       if(X%2==0)
				      {
				         
				         even=even+X+" ";
				         evencount++;
		              }
				     else
				       {
		                
		                odd=odd+X+" ";
		                oddcount++;
				       }
		    }
		     System.out.println("Even number is: "+even);
		     System.out.println("Odd number is: "+odd);
		     System.out.println("Even number count is: "+evencount);
		     System.out.println("Odd number count is: "+oddcount);
	}
}


