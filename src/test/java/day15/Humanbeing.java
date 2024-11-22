package day15;

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
  
