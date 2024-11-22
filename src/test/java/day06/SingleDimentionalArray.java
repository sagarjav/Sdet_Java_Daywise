package day06;


/*
 * 1.Declaration an array
 * 2.add value into array
 * 3.find size of an array
 * 4.read single value fom array
 * read multiple values from an array
 */
public class SingleDimentionalArray {
	
	
	public static void main(String[] args) 
	{
		
		//declaration of array
		//approach 1
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//enhanced for loop/ for each loop
		for(int values:a) 
		{
		
			System.out.println(values);
			
		}
		System.out.println("<--------SPACE-------->");
		
		//approach 2
		int b[]= {100,250,1515,1236,147,15,1511,655};   
		//find length of an array
		int h=b.length;                                  //lenght of array 8
		
		System.out.println("length of an array: "+b.length);
		System.out.println(b[4]);        //here 4 is index
		
		for(int i=0; i<b.length; i++) 
		{
			System.out.println(b[i]);
		}
		
		
		
		
		
		
		
	}

}
