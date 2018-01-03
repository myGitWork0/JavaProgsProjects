
import java.util.Scanner;

class Company {
		public static void main(String arg[]){
			Companymeth obj=new Companymeth();
		}
}




class Companymeth {
	int yearOfEstablishment,annualTurnover,annualSales;
	double profitability;
	Companymeth(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year of Establishment:");
		yearOfEstablishment = in.nextInt();
		System.out.println("Enter the annual Turnover:");
		annualTurnover = in.nextInt();
		System.out.println("Enter Annual Sales:");
		annualSales = in.nextInt();
		status();
	}
	void status(){
		profitability=annualTurnover/annualSales;
		if(profitability>1)
			System.out.println("profitability is high");
		else
			if(profitability<0.5)
				System.out.println("profitability is low");
			else
				if(profitability>=0.5&&profitability<=1)
					System.out.println("profitability is medium");
			
		}
	
}
