package day06;

public class TwoDimensionalArray {
	
	
	public static void main(String[] args) {
		
		//two dimensional array
		//approach 1
		
		int a[][]=new int[4][3]; //3 rows and 3 column
		a[0][0]=241;
		a[0][1]=145;
		a[0][2]=215;
		
		a[1][0]=251;
		a[1][1]=548;
		a[1][2]=365;
		
		a[2][0]=456;
		a[2][1]=325;
		a[2][2]=659;
		
		a[3][0]=256;
		a[3][1]=333;
		a[3][2]=145;
		
	
		
		
		//3 Row   and 2 column
		
		//for each loop /enhanced loop
		for(int arr[]:a) 
		{
			for(int x:arr)  //241 145 215
			{
			System.out.print(x+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("<---------SPACE---------->");
		
		//approach 1
		int b[][]= {   {1021,251,251},
				        {235,548,695},
				        {124,999,546}
				
				    };
		
		
		for(int Y[]:b)
		{
			for(int P:Y)
			{
				System.out.print(P+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
