package basic;

public class Animal {
	boolean sleep = false ;
	boolean hunger = false;
	int timetoeat = 0;
	int bark(){
		if(sleep == true || hunger == true ){
			System.out.println("i dont bark because i m tired & sleepy");
		}
		else
			System.out.println("Bow Bow Bow");
			hunger = true;
			return 1;
	}
	int eat(){
		if(sleep==true){
			System.out.println("i am sleeping so i dont eat");
		}
		else
		if(hunger==true || timetoeat ==3){
			System.out.println("i am eating ......");
			hunger=false;
		}
		else
			System.out.println("i am not hungry ");
		timetoeat = 0;
		return 1;
	}
	
	int sleepwake(){
		if(sleep==false){
			System.out.println("i am sleeping....");
			sleep = true;
			timetoeat=2;
		}
		else{
			System.out.println("i m getting up ..");
			sleep = false;
			timetoeat=3;
		}
		return 1;
	}
		
}
