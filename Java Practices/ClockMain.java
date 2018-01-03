class Clock {
		int Hour,Minutes,Seconds,Hours2;
		Clock(){
			Hour=24;
			Minutes=00;
			Seconds=00;
			displayTime();
			displayMsg();
		}
	Clock(int a,int b,int c){
	getHours(a);
	getMinutes(b);
	getSeconds(c);
	displayTime();
	displayMsg();
	}	
	  void	getHours(int x){
			Hours=x;
			Hours2=x;
		}
	  void getMinutes(int y){
		  Minutes=y;
	  }
	  void getSeconds(int z){
		  Seconds=z;
	  }

	
	  void displayTime(){
		  if(Hours>12){
			Hours=Hours-12;
			System.out.println(Hours+":"+Minutes+":"+Seconds+"PM");
		  }
		  else
			  System.out.println(Hours+":"+Minutes+":"+Seconds+"AM");
	  }
	  void displayMsg(){
		  if(Hours2>0&&Hours2<=6>)
			  System.out.println("Its Late night ! Go to Sleep");
		  else
			  if(Hours2>6&&Hours2<=12)
				  System.out.println("Good Morning");
			  else
				  if(Hours2>12&&Hours2<=18)
					  System.out.println("Good Afternoon");
				  else
					  if(Hours2>18&&Hours2<=20)
						  System.out.println("Good Evening");
					  else
						  if(Hours2>20&&Hours2<=24)
							  System.out.println("Good Night");
	  }
}




 class ClockMain {
		public static void main(String arg[]){
			if(arg.length==0)
				Clock mid=new clock();
			else	
			int a = Integer.parseInt(arg[0]);
			int b = Integer.parseInt(arg[1]);
			int c=	Integer.parseInt(arg[2]);
			Clock mid=new clock(a,b,c);
			
		}
}
