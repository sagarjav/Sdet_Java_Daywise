package day20_Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetDemo {

	
	
	public static void main(String[] args) 
	{
		HashSet myset=new HashSet();   //case1  child store to child
		//Set myset=new HashSet();     //case2  child store to parent
		myset.add(100);
		myset.add("SAGAR");
		myset.add('D');
		myset.add(150);
		myset.add(251);
		myset.add("java");
		myset.add("selenium");
		System.out.println("HashSet data:   "+myset);
		
		HashSet<String> myset1=new HashSet <String> ();  //case3 make homogeneous 
		
		
		//convert HashSet to Arraylist
		ArrayList Ar=new ArrayList(myset);
		System.out.println("Arraylist data: "+Ar);
		
		//now we use here for each loop to print the data
		for(Object X:Ar) 
		{
		}
		
		
		
	}
}
