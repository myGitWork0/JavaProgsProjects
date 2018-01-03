

import java.util.Scanner;

public class primsAl {
	public static int si;
	public static int graph[][];
	
	public int minKey(int key[], Boolean minS[])
    {
       
        int min_index=-1,min = 999999;
        for (int vertex = 0; vertex < si; vertex++)
            if (minS[vertex] == false && key[vertex] < min)
            {
                min = key[vertex];
                min_index = vertex;
            }
        return min_index;
    }
   
}
