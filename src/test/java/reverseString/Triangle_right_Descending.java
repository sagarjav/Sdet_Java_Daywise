package reverseString;

public class Triangle_right_Descending {

	public static void main(String[] args) {

       //*****
	   // ****
		// ***
		//  **
		//   *
		 
		 int space=0;
		 int star=5;
		 
		for(int i=1; i<=5; i++) 
		{
				//space print
				for(int m=1; m<space; m++ ) 
				{
					System.out.print("N");
				}
				
	          //star print
				for(int j=1; j<=star; j++ ) 
				{
					System.out.print("*");
				}
				System.out.println();
				space++;
				star--;
		}

	}

}
