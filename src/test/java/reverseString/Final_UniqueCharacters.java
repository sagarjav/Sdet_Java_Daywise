package reverseString;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Final_UniqueCharacters {
    public static void main(String[] args) 
    {
        String str="SAGAR";
        
        
        LinkedHashSet<Character> seen=new LinkedHashSet<>();
        LinkedHashSet<Character> dub_seen=new LinkedHashSet<>();
        StringBuilder result=new StringBuilder(); 
       
        for(char ch:str.toCharArray())
        {
        	System.out.println(ch+"----->"+str.indexOf(ch));
        	System.out.println(ch+"----->"+str.lastIndexOf(ch));
        	
        	if(str.indexOf(ch)==str.lastIndexOf(ch))
        	{
        		seen.add(ch);
        	}
        	
        	else
        	{
        		dub_seen.add(ch);
        	}
        }
        
       
       
        for(char ch:seen) 
        {
        	result.append(ch);
        }
        System.out.println("Unique character in string Array: "+seen);
        System.out.println("Unique character in string: "+result);
        
        System.out.println("Dublicate character in string Array: "+dub_seen);
        
    }
    
    
}
