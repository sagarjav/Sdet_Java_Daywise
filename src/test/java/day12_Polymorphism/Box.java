package day12_Polymorphism;

public class Box {
	
	
	double width,height,depth;
	
	Box() //1
	{
		width=height=depth=0;
	}
	
	
	Box(double a,double b,double c) //2
	{
		width=a;
		height=b;
		depth=c;
	}
	
	
	Box(double a) //3
	{
		width=height=depth=a;
	}
	
	double volume() //4
	{
	return(width*height*depth);
	}

}
