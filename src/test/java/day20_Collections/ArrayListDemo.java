package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	   public static void main(String[] args) 
	   {
		
		   ArrayList ar=new ArrayList();
		   ar.add(100);
		   ar.add("SAGAR");
		   ar.add('A');
		   ar.add(500);
		   ar.add("JAPAN");
		   ar.add('D');
		   System.out.println(ar);
		   System.out.println(ar.size());  //length of ar
		   
		   for(int i=0; i<ar.size(); i++) 
		   {
			   System.out.println(ar.get(i));
		   }
		   
		   System.out.println("for each loop....");
		   for(Object X:ar)
		   {
			   System.out.println(X);
		   }
		   
		   System.out.println("for iterator....");
		   //using iterator
		   Iterator it=ar.iterator();
		   while(it.hasNext())      //boolean type return like true/false
		   {
			   System.out.println(it.next());
		   }
		   
		   
	   }
}
