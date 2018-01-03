

import java.util.Scanner;

public class primsMin extends primsAl{
	 public void priAlgo(int graph[][])
    {
		 int key[] = new int [si];
		 int parent[] = new int[si];
        Boolean minS[] = new Boolean[si];
        for (int i = 0; i < si; i++)
        {
            key[i] = 999999;
            minS[i] = false;
        }
        parent[0] = -1; 
        key[0] = 0;                
        for (int count = 0; count < si-1; count++)
        {
            int u = minKey(key, minS);   
            minS[u] = true;
            for (int v = 0; v < si; v++)
                if (graph[u][v]!=0 && minS[v] == false &&
                    graph[u][v] <  key[v])
                {
                    parent[v]  = u;
                    key[v] = graph[u][v];
                }
        }
        System.out.println("Edge       Weight");
        for (int i = 1; i < si; i++)
            System.out.println(parent[i]+" - "+ i+"    "+graph[i][parent[i]]);
    }
	 
	 public static void main(String p[]){
		 primsAl t = new primsAl();
		 primsMin t1=new primsMin();
	        System.out.println("enter number of nodes");
	        Scanner sc= new Scanner(System.in);
	        t.si=sc.nextInt();
	        t.graph=new int[si][si];
	        for(int i=0;i<si;i++){
				for(int j=0;j<si;j++){
					if(i==j){
						continue;
					}
					System.out.println("Enter weight between node "+(i)+" and node "+(j)+" ");
					t.graph[i][j]=sc.nextInt();
				}
			}
	        
	       t1.priAlgo(t.graph);
	 }
	 
}
