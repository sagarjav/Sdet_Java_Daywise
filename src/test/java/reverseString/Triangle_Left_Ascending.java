package reverseString;

public class Triangle_Left_Ascending {

	public static void main(String[] args) {
		//Left Ascending triangle
		//*      //Row=5
		//**     //Column=5
		//***
		//****
		//*****
		
		for(int i=0; i<5; i++) 
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
