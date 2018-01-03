package Practise1;

import java.util.Scanner;

public class Queens {
	public int[][] b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		Queens q=new Queens(n);
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a=q.place(i);
		}
	}
	public Queens(int n){
		b=new int[n][n];
	}
	public int[] place(int r){
		if(nocollision){
			
		}
	}
	

}
