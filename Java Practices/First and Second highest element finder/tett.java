package Practise1;

import java.util.ArrayList;
import java.util.Arrays;

public class tett {

	public static int[] main(String[] args) {
		// TODO Auto-generated method stub
	int [] nums={2,7,11,15};
	int target =9;
	int [] a=new int[2];
	a[0]=-1;
	a[1]=-1;
	for(int i=0;i<nums.length-1;i++){
		for(int j=i;j<nums.length;j++){
			if((nums[i]+nums[j])==target){
				a[0]=nums[i];
				a[1]=nums[j];
				break;
			}
		}
	}
	return a;
	}

}
