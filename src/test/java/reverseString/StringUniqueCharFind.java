package reverseString;

import java.util.HashSet;

public class StringUniqueCharFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SAGARAARS";
		
		HashSet <Character> unique=new HashSet<>();
		HashSet <Character> main_unique=new HashSet<>();
		
		for(int i=0; i<str.length(); i++)
		{
			
			for(int j=0; j<str.length(); j++)
			{
				/*
				if(str.charAt(i)==str.charAt(j) && i!=j)
				{
					//System.out.print(" "+str.charAt(i));
				}
				else 
				{
					System.out.print(" "+str.charAt(i));
				}  */
				
				
				
			}
			
			
			if(unique.add(str.charAt(i))==false)
			{
				main_unique.add(str.charAt(i));
			}
			else {
				//System.out.println(" "+str.charAt(i));
				//System.out.print("main_unique "+main_unique.toString());
			}
			System.out.print("main_unique "+main_unique.toString());
			
		}

	}

}
