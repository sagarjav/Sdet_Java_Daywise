package reverseString;

import java.util.Arrays;

public class SortArrayand2ndLargetsNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2,4,8,1,2,7,65,24,81,24,256,54,9};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.print(" "+numbers[numbers.length-2]);
		
			/*for(int i=numbers.length-1; i>=0; i--)
			{
				System.out.print(" "+numbers[numbers.length-2]);
				
			} */

	}

}
