
public class CheckDup 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr={2,6,0,1,9,4,5,8,3};
		int i,j,n=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					n=1;
	
				}
				
			}
		}
			if(n==1)
			System.out.println("True Found");
		else
			System.out.println("Not Found");




			}

}
