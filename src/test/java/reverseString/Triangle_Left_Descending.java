package reverseString;

public class Triangle_Left_Descending {

	public static void main(String[] args) {
		//Left Descending triangle
				//*****      //Row=5
				//****     //Column=5
				//***
				//**
				//*
		
		//for row
		for(int i=5; i>0; i--) 
		{
			
			//inner loop for column
			for(int j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
