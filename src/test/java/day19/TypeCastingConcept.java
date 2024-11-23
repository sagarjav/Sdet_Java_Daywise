package day19;
/*
 * Upcasting -->converting value from smaller --->Larger
 * int------> long
 * float----->double
 
  Downcasting---> converting value from higher ---->smaller
     long--->int
     double---->float
     
     short-->int-->long-->float-->double
     8bit   16bit  64bit  32bit   64bit
 */
public class TypeCastingConcept {
	public static void main(String[] args) 
	{
		
		//Upcasting---->automatic -----smaller to larger
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		
		//DownCasting ----> manually----larger to smaller
		long longvalue1=1000;
		int intv=(int) longvalue1;   //cast first into int ---> then store in int
		
		
		
		
	}

}
