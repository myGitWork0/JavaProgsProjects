import java.util.ArrayList;

public class Recursive {
	int j=0;
	int k=0;
	int n1=1;
	int n2=1;
	char[] ch;
	ArrayList<String> al=new ArrayList<String>();
	StringBuilder sb;
	int[] memo;
	public int recursiveFibonacci(int n){
		j++;
		if(n==1||n==2)	return 1;
		else return(recursiveFibonacci(n-1)+recursiveFibonacci(n-2));
	}
	public Recursive() {}
	public Recursive(int m) {
		memo=new int[m+1];
		memo[0]=0;
		memo[1]=1;
		memo[2]=1;
		for(int i=3;i<=m;i++) {memo[i]=-1;}
		System.out.println("memoization is "+fibomemoization(8));
	}
	public int sumOfTriangle(int[] a) {
		if(a.length==1) {return a[0];}
		else{
				int[] b=new int[a.length-1];
				for(int i=0;i<a.length-1;i++) {
					
					b[i]=a[i]+a[i+1];
				}
				return sumOfTriangle(b);
			}
	}
	public int fibomemoization(int n) {
		k++;
		if(memo[n]!=-1) {
			return memo[n];
		}
		else
			memo[n-1]=fibomemoization(n-1);
			memo[n-2]=fibomemoization(n-2);
			memo[n]=memo[n-1]+memo[n-2];
			return memo[n];
		
	}
	public void printNBinary(int n,String str) {
		if(str.length()==3) { 
			System.out.println(str);
			return;
		} 
		else {
			printNBinary(n,str+'0');
			printNBinary(n,str+'1');
		}
	}
	
	public void subList(ArrayList<String> al,ArrayList<String> elementToAdded) {
		if(elementToAdded.size()==0) { return;}
		else {
			
			String s=elementToAdded.get(0);
			al.add(s);
			System.out.println(al.toString());
			elementToAdded.remove(0);
			subList(al,elementToAdded);
			al.remove(s);
			subList(al,elementToAdded);
			elementToAdded.add(0,s);
		}
	}
	
	public void allStringPermutations(String name,int index) {
		if(index==name.length()-1) {if(!al.contains(name))al.add(name);}
		else {
			for(int i=index;i<name.length();i++) {
				ch=name.toCharArray();
				char temp=ch[index];
				ch[index]=ch[i];
				ch[i]=temp;
				allStringPermutations(new String(ch),index+1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Recursive r=new Recursive();
//			System.out.println(r.recursiveFibonacci(8));
//			System.out.println(r.j+"    "+r.k);
//			int[] a= {20,28};
//			System.out.println(r.sumOfTriangle(a));
			
//			String permuteString="pavan";
//			r.allStringPermutations(permuteString,0);
//			System.out.println(r.al.toString());
			r.printNBinary(3,"");
			ArrayList<String> al=new ArrayList<String>();
			ArrayList<String> elementToAdded=new ArrayList<String>();
			elementToAdded.add("123");
			elementToAdded.add("abc");
			elementToAdded.add("ghi");
			elementToAdded.add("def");
			r.subList(al, elementToAdded);
	}
	

}
