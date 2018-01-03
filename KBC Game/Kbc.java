package Practise1;

import java.util.Scanner;
public class Kbc {
	protected String[] questions={"Who are you ???student","what is ur name ???dinesh","what is your course name ???computer networks","where are you studying ???western illinois university","who is your sponsor ???father","Are you a professor ???no"};
	protected String[][] options={{"Student","Farmer","Employee","Pilot"},{"dinesh","Vimal","Kamal","Durmal"},{"computer networks","rocket science","medical science","history"},{"western illinois university","tirichi university","JNTU","AU"},{"father","mother","sister","brother"},{"yes","NO","may be","none of the above"}};
	protected String[] ques;
	protected int r,entered,m,p,n=0;
	protected boolean paf=true;
	protected boolean with=false;
	protected boolean fifty=true;
	protected boolean aud=true;
	protected int[] q={-1,-1,-1,-1,-1,-1};
	protected int op[]={-1,-1,-1,-1};
	protected int opt[]={-1,-1,-1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kbc kb=new Kbc();
		kb.method();
	}
	public void audiencePoll(){
		Scanner sc=new Scanner(System.in);
		if(aud==false){
			System.out.println("You have already used this lifeline");
			System.out.println("Enter your option..");
			entered=(sc.nextInt())-1;
		}
		if(aud==true){
			aud=false;
			int x=100;
			for(int i=0;i<4;i++){
				if(options[r][opt[i]].equalsIgnoreCase(ques[1])){
					System.out.println((x=x-(x/2))+" % people says "+options[r][opt[i]]+" as right option");
				}
				else{
					System.out.println((x=(x-(x/2))-2)+"% of ppl says "+options[r][opt[i]]+" as right option");
				}
			}
			System.out.print("Enter your choice...  : ");
			entered=sc.nextInt()-1;
			answer();
		}
	}
	public void phoneAFriend(){
		Scanner sc=new Scanner(System.in);
		if(paf==false ){
			System.out.println("You have already used this...");
			System.out.println("Enter other option : ");
			entered=sc.nextInt()-1;
			while(entered!=6 && entered!=8 && !(entered>=0 && entered<4)){
				System.out.println("Wrong option ");
				entered=sc.nextInt()-1;
			}
			if(entered==6){
				audiencePoll();
			}
			else if(entered==8){
				fiftyFifty();
			}
		}
		else{
			paf=false;
			System.out.println("Enter name of the person you wish to call");
			String frname=sc.nextLine();
			for(int i=0;i<4;i++){
				if(options[r][opt[i]].equalsIgnoreCase(ques[1])){
					System.out.println(frname+" says "+options[r][opt[i]]+" as right Answer");
				}
			}
			System.out.println("Enter your option : ");
			entered=sc.nextInt()-1;
			answer();
		}	
	}
	public void fiftyFifty(){
		Scanner sc=new Scanner(System.in);
		if(fifty==false){
			System.out.println("You have already used this...");
			System.out.println("Enter other option");
			entered=sc.nextInt()-1;		
			while(entered!=6&&entered!=7&&!(entered>=0 && entered<4)){
				System.out.println("Wrong option ");
				entered=sc.nextInt()-1;				
			}
			if(entered==6){
				audiencePoll();
			}
			else if(entered==7){
				phoneAFriend();
			}
		}
		else{
			fifty=false;
			int i=0;
			for(i=0;i<4;i++){
				if(options[r][opt[i]].equalsIgnoreCase(ques[1])){
					System.out.println((i+1)+" ) "+options[r][opt[i]]);
					break;
				}
			}
			System.out.println((4%i)+1+" ) "+options[r][opt[4%i]]);
			entered=sc.nextInt()-1;
			answer();
		}
	}
	public void answer(){
		if(entered==6){
			audiencePoll();
		}
		if(entered==7){
			phoneAFriend();
		}
		if(entered==8){
			fiftyFifty();
		}
		else{
			System.out.println(options[r][opt[entered]]);
			if(options[r][opt[entered]].equalsIgnoreCase(ques[1])){
				System.out.println("Your Are Right !!! HURRAYYY YOU WON "+(n)*Math.pow(10, n+1)+"$");
			}
			else{
				System.out.println("Sorry You Lose better luck next time");
				System.exit(0);
			}	
		}
	}
	public void method(){
		Scanner sc=new Scanner(System.in);
		r=(int)Math.floor(Math.random()*6);
		while(n<5){
			if(q[r]!=-1){
				r=(int)Math.floor(Math.random()*6);
				continue;
			}
			else{
				q[r]=r;
				if(n==4){
					System.out.println();
					System.out.println("This is going to be your last question... I WISH YOU THE BEST");
				}
				n++;
				System.out.println("This is "+(n)*Math.pow(10, n+1)+"$ question");
				ques=questions[r].split("[?]{3,}");
				System.out.println();
				System.out.println(ques[0]);
				for(int z=0;z<4;z++){
					op[z]=-1;
					opt[z]=-1;
				}
				m=(int)Math.floor(Math.random()*4);
				p=0;
				while(p<4){
					if(op[m]!=-1){
						m=(int)Math.floor(Math.random()*4);
						continue;
					}
					else{
						op[m]=m;
						opt[p]=m;
						System.out.print("");
						System.out.println(p+1+" )   "+options[r][m]);
						p++;
						m=(int)Math.floor(Math.random()*4);
					}
				}
				System.out.println("Enter Your Option and to use lifeline Enter\n 7 for audience poll \n 8 for phone a friend \n 9 for 50/50 \n  ");
				
				entered=(sc.nextInt())-1;
				if(entered==6){
					audiencePoll();
				}
				if(entered==7){
					phoneAFriend();
				}
				if(entered==8){
					fiftyFifty();
				}
				if(entered>=0&&entered<4){
					answer();
				}
				r=(int)Math.floor(Math.random()*6);
			}
		}
	}
}
