package day15_Method_Overloading_final_Keyword_Super_keyword;

 class Humanbeing 
 {
	 public  int  walk(int distance , int time) 
	 {
		 int speed=distance/time;
		 return speed;
		 
	 }

}
 
 
 class Athlete extends Humanbeing 
 {

	 
	 public  int  walk(int distance , int time) 
	 {
		 int speed=distance/time;
		     speed=speed*2;
		 return speed;
		 
	 }
	 
	 
	 
	 
 }
  
