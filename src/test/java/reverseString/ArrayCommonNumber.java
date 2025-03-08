package reverseString;

public class ArrayCommonNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] array1= {2,5,15,81,34,7};
		int [] array2= {15,31,5,63,95,7};
		
		
		for(int i=0; i<=array1.length-1; i++)
		{
			
			for(int j=0; j<=array2.length-1; j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.print(" "+array1[i]);
				}
			}
		}

	}

}
