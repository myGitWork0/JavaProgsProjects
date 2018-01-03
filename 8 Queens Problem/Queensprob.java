package Practise1;

import java.util.Scanner;

public class Queensprob {
	static int size;
	static int b[][];
	 public Queensprob(){
		 Scanner sc=new Scanner(System.in); 	
	    	size=sc.nextInt();
	    	b=new int[size][size];
	    	for(int i=0;i<size;i++){
	    		for(int j=0;j<size;j++){
	    			b[i][j]=0;
	    		}
	    	}
	    	checkCol(b, 0);
	 }
	    boolean checkRowColDiag(int b[][], int row, int col)
	    {
	        int i, j;
	        for (i = 0; i < col; i++)
	            if (b[row][i] == 1)
	                return false;
	        for (i=row, j=col; i>=0 && j>=0; i--, j--)
	            if (b[i][j] == 1)
	                return false;
	        for (i=row, j=col; j>=0 && i<size; i++, j--)
	            if (b[i][j] == 1)
	                return false;
	        return true;
	    }

	    boolean checkCol(int b[][], int col)
	    {
	       
	        if (col >= size)
	            return true;
	        for (int i = 0; i < size; i++)
	        {
	            if (checkRowColDiag(b, i, col))
	            {
	                b[i][col] = 1;
	                if (checkCol(b, col + 1) == true){
	                	return true; 
	                }
	                else{
	                b[i][col] = 0;
	                }
	            }
	        }
	        return false;
	    }

	    public static void main(String args[])
	    {
	    	Queensprob Q = new Queensprob();
	    	 for (int i = 0; i < size; i++)
		        {
		            for (int j = 0; j < size; j++)
		                System.out.print(" " + b[i][j]+ " ");
		            System.out.println();
		        }
	    }
}
