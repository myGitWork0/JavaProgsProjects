
public class PerceptronAi {
	private static int input[][]={{0,0},{0,1},{1,0},{1,1}};
	private static int target[];
	private static int actual[];
	private static double learning;
	private static int epoch;
	private static int threshold;
	private static double weight1[];
	private static double weight2[];
	private static double w1;
	private static double w2;
	public PerceptronAi(int[] a,double b,double c,int th,double lea){
		target=new int[4];
		for(int i=0;i<4;i++){
			target[i]=a[i];
		}
		actual=new int[4];
		w1=b;
		w2=c;
		threshold=th;
		learning=lea;
		weight1=new double[4];
		weight2=new double[4];
	}
	public boolean check(){
		for(int i=0;i<4;i++){
			if(target[i]!=actual[i])
				return false;
		}
		return true;
	}
	public void training(){
		epoch=1;
		while((!check())&&(epoch<=20)){
			
			for(int i=0;i<4;i++){
				System.out.print("For inputs ("+input[i][0]+","+input[i][1]+") = ");
				
				if((input[i][0]*w1 + input[i][1]*w2)<threshold){
					System.out.println(input[i][0]+" * "+w1+" + "+input[i][1]+" * "+w2+" < "+threshold);
					System.out.println("actual output = 0");
					actual[i]=0;
				}
				else{
					System.out.println(input[i][0]+" * "+w1+" + "+input[i][1]+" * "+w2+" >= "+threshold);
					System.out.println("actual output = 1");
					actual[i]=1;
				}
				System.out.print("Updated weights w1 = "+w1+" + "+learning+" * ("+target[i]+" - "+actual[i]+" )*"+input[i][0]+" = ");
				w1=w1+learning*(target[i]-actual[i])*input[i][0];
				w1=Math.round(w1*100.0)/100.0;
				System.out.println(w1);
				System.out.print("Updated weights w2 = "+w2+" + "+learning+" * ("+target[i]+" - "+actual[i]+" )*"+input[i][1]+" = ");
				System.out.println(w2);
				weight1[i]=w1;
				w2=w2+learning*(target[i]-actual[i])*input[i][1];
				w2=Math.round(w2*100.0)/100.0;
				weight2[i]=w2;
				
				System.out.println("");
			}
			
			//System.out.println("This is Epoch : "+epoch);
			System.out.println("Target		Actual			weight1			weight2");
			for(int i=0;i<4;i++){
				System.out.println(target[i]+"		"+actual[i]+"			"+weight1[i]+"			"+weight2[i]);
			}
			System.out.println("\n");
			epoch++;
			
		}
		if(epoch>=20){
			System.out.println("since weights are not changing it goes infinite");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] and1={0,0,0,1};
		int[] or1={0,1,1,1};
		int[] nor1={1,0,0,0};
		int[] nand1={1,1,1,0};
		System.out.println("\nThis is or implementation");
		System.out.println("_________________________________");
 		PerceptronAi p=new PerceptronAi(or1,0.9,0.7,3,0.5);
 		p.training();
 		System.out.println("\nThis is and implementation");
		System.out.println("_________________________________");
 		PerceptronAi p1=new PerceptronAi(and1,0.2,0.8,2,0.5);
 		p1.training();
 		System.out.println("\nThis is nor implementation");
		System.out.println("_________________________________");
 		PerceptronAi p2=new PerceptronAi(nor1,0.9,0.8,-3,0.5);
 		p2.training();
		System.out.println("\nThis is nand1 implementation");
		System.out.println("_________________________________");
		PerceptronAi p3=new PerceptronAi(nand1,0.2,0.8,2,0.5);
 		p3.training();
	}

}
