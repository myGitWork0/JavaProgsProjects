
import java.util.Scanner;

public class BackProp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of hidden layers: ");
		int hiddenlayercount=sc.nextInt();
		System.out.println();
		System.out.print("Enter number of outputs: ");
		int outputnum=sc.nextInt();
		Init i=new Init(hiddenlayercount,outputnum);
		System.out.println("-------------------Input is 0 0 and output is 0-------------------");
		for(int j=0;j<2;j++){
			System.out.println("In loop "+j+1);
			System.out.println();
			i.hiddenunitcalc(0,0);
			System.out.println();
			i.outputunit(0);
			System.out.println();
			i.backward(0);
			System.out.println();
			i.outweightchange();
			System.out.println();
			i.inputlayerhiddenlayer();
			System.out.println();
			i.inphidden(1,1);
		}
		System.out.println("-------------------Input is 0 1 and output is 1-------------------");
		for(int j=0;j<2;j++){
			System.out.println("In loop "+j+1);
			System.out.println();
			i.hiddenunitcalc(0,1);
			System.out.println();
			i.outputunit(1);
			System.out.println();
			i.backward(1);
			System.out.println();
			i.outweightchange();
			System.out.println();
			i.inputlayerhiddenlayer();
			System.out.println();
			i.inphidden(0,1);
		}
		System.out.println("-------------------Input is 1 0 and output is 1-------------------");
		for(int j=0;j<2;j++){
			System.out.println("In loop "+j+1);
			System.out.println();
			i.hiddenunitcalc(1,0);
			System.out.println();
			i.outputunit(1);
			System.out.println();
			i.backward(1);
			System.out.println();
			i.outweightchange();
			System.out.println();
			i.inputlayerhiddenlayer();
			System.out.println();
			i.inphidden(1,0);
		}
		System.out.println("-------------------Input is 1 1 and output is 0-------------------");
		for(int j=0;j<2;j++){
			System.out.println("In loop "+j+1);
			System.out.println();
			i.hiddenunitcalc(1,1);
			System.out.println();
			i.outputunit(0);
			System.out.println();
			i.backward(0);
			System.out.println();
			i.outweightchange();
			System.out.println();
			i.inputlayerhiddenlayer();
			System.out.println();
			i.inphidden(1,1);
		}
	}
}