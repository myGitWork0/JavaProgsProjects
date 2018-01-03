

public class Init {
	private double[][] inputweight;
	private double[][] outweight;
	private double[][] copyoutweight;
	private double[] hiddenunit;
	private double[] hiddenunitoutput;
	private double[] netoutput;
	private double[] outout;
	private double[] deltaoutput;
	private double[] deltahidden;
	private double coef;
	public Init(int hi,int ou){
		outweight=new double[hi][ou];
		copyoutweight=new double[hi][ou];
		inputweight=new double[2][hi];
		hiddenunit=new double[inputweight[0].length];
		hiddenunitoutput=new double[inputweight[0].length];
		deltahidden=new double[inputweight[0].length];
		netoutput=new double[outweight[0].length];
		outout=new double[outweight[0].length];
		deltaoutput=new double[outweight[0].length];
		
		for(int i=0;i<inputweight.length;i++){
			for(int j=0;j<inputweight[0].length;j++){
				inputweight[i][j]=Math.random();
				System.out.println("Input Weight "+i+" "+j+" "+inputweight[i][j]);
			}
		}
		
		for(int i=0;i<outweight.length;i++){
			for(int j=0;j<outweight[0].length;j++){
				outweight[i][j]=Math.random();
				copyoutweight[i][j]=outweight[i][j];
				System.out.println("Input weights "+i+" "+j+" " + outweight[i][j]);
			}
		}
		
		coef=0.2;
		for(int i=0;i<outweight[0].length;i++){
			netoutput[i]=0;
		}
	}
	//in1=0, in2=0;
	public void hiddenunitcalc(int in1,int in2){
		System.out.println("Feed forward Step");
		
		for(int i=0;i<inputweight[0].length;i++){
			hiddenunit[i]=in1*inputweight[in1][i]+in2*inputweight[in2][i];
			hiddenunitoutput[i]=(1/(1+Math.pow(2.7182812,hiddenunit[i])));
			System.out.println("Hidden unit "+i+" is "+hiddenunit[i]);
			System.out.println("Hidden unit output"+i+" is "+hiddenunitoutput[i]);
		}
	}
	//out=0;
	public void outputunit(int out){
		for(int i=0;i<outweight.length;i++){
			for(int j=0;j<outweight[0].length;j++){
				netoutput[j]=netoutput[j]+hiddenunitoutput[i]*outweight[i][j];
			}
		}
		for(int i=0;i<outweight[0].length;i++){
			outout[i]=(1/(1+Math.pow(2.7182812,netoutput[i])));
			if(outout[i]>0.9){
				outout[i]=1;
			}
			if(outout[i]<0.1){
				outout[i]=0;
			}
			System.out.println("Net output is "+netoutput[i]);
			System.out.println("output of output is "+outout[i]);
		}
	}
	//tout=0;
	public void backward(int tout){
		for(int i=0;i<outweight[0].length;i++){
			deltaoutput[i]=(tout-outout[i])*outout[i]*(1-outout[i]);
			System.out.println("delta output is "+deltaoutput[i]);
		}
	}
	public void outweightchange(){
		System.out.println("New Weights between hidden layer and output layer");
		for(int i=0;i<outweight.length;i++){
			for(int j=0;j<outweight[0].length;j++){
				outweight[i][j]=outweight[i][j]+(coef *deltaoutput[j]*hiddenunitoutput[i]);
				System.out.println("New weight "+i+" "+j+" "+outweight[i][j]);
			}
		}
	}
	public void inputlayerhiddenlayer(){
		for(int i=0;i<inputweight[0].length;i++){
			for(int j=0;j<outweight[0].length;j++){
				deltahidden[i]=deltahidden[i]+deltaoutput[j]*copyoutweight[i][j];
			}
		}
		for(int i=0;i<inputweight[0].length;i++){
			deltahidden[i]=deltahidden[i]*hiddenunit[i]*(1-hiddenunit[i]);
			System.out.println("delta hidden "+i+" "+deltahidden[i]);
		}
	}
	//in1=0,in2=0;
	public void inphidden(int in1,int in2){
		int inp;
		System.out.println("New Values between input and hidden units");
		for(int i=0;i<inputweight.length;i++){
			for(int j=0;j<inputweight[0].length;j++){
				if(i==0){
					inp=in1;
				}else{
					inp=in2;
				}
				inputweight[i][j]=inputweight[i][j]+(coef*deltahidden[i]*inp);
				System.out.println("New weights "+i+" "+j+" "+inputweight[i][j]);
			}
		}
	}	
}
