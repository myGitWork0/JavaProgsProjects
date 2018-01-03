

import java.util.Random;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int[] arr={2,6,9,1,2,4,5,8,3};
			int x=checkSum(arr);
			System.out.println("//Checksum :X is "+x);
			
			int[] input={2,6,0,2,9,4,5,8,3};
			
			System.out.println("//CheckDup : so it is "+checkDup(input));
			
			int num=345;
			int sum=sumOfDigits(num);
			System.out.println("//SumOfDigits :Sum is "+sum);
			
			int[] a={1,1,1,1,4,4,1,1,1,1,1};
			int max=longestSequence(a);
			System.out.println("//longestSequence :Sequence is "+max);
			
			int n=10,min=22,mx=58;
			int[] rand=new int[10];
			rand=getRandom(n,min,mx);
			for(int i =0; i < n; i++)
			{
			    System.out.print(rand[i]+" ");
			    
			}
	}
}
		
		public static int checkSum(int[] input)
		{
			int i,j,n=0;
			for(j=0,i=10;j<input.length;j++,i--)
			{
				n+=input[j]*i;		
			}
			int rem,x;
			rem=n%11;
			x=11-rem;
			return x;
		}
		
		public static boolean checkDup(int[] input)
		{
			int i,j,n=0;
			for(i=0;i<input.length;i++)
			{
				for(j=i+1;j<input.length;j++)
				{
					if(input[i]==input[j])
					{
						n=1;
					}
				}
			}
				if(n==1)
				{
					return true; 
				}
				else
				{
					return false;
				}
		}
		
		public static int sumOfDigits(int n)          
		{
			int sum=0,rem=0;
			while(n>0)
			{
				rem=n%10;
				n=n/10;
				sum=sum+rem;
			}
			return(sum);
		}
		
		public static int longestSequence(int[] arr)
		{
			int count=1,max=1;
			for(int i=0;i<arr.length-1;i++)
			{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
			else if (count>=max)
			{
				max=count;
				count=1;
			}
			else {
				count=1;
			}
		}	
		return(Math.max(max,count));
		}
		
		public static  int[]  getRandom(int  n,  int  a,  int b)
		{
		 	Random rn = new Random();
			int[] rand = new int[n];
			for(int i =0; i < n; i++)
			{
			    int answer = rn.nextInt(b-a)+a;
			    System.out.println(answer);
			    rand[i]=answer;
			}
			return rand;
		}
}