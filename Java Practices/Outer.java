package Practise1;

public class Outer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{0}};
		int[] ar=new int[10];
		ar=outer2d(arr);
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
	}
	public static int[] outer2d(int[][] arr){
		if(arr.length==1){
			int c[]=new int[1];
			c[0]=arr[0][0];
			return c;
		}
		else{
		int[] b=new int[(arr.length*arr[0].length)-1];
		int k=0;
		for(int i=0;i<arr[0].length;i++){
			b[k++]=arr[0][i];
		}
		for(int i=1;i<arr.length;i++){
			b[k++]=arr[i][arr[i].length-1];
		}
		for(int i=arr[0].length-2;i>=0;i--){
			b[k++]=arr[arr.length-1][i];
		}
		for(int i=arr.length-2;i>=1;i--){
			b[k++]=arr[i][0];
		}
			return b;
		}
	}

}
