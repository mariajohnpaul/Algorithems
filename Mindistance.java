package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mindistance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        int C[] =Arrays.copyOf(A,n); 
        Arrays.sort(A);
        Map<Integer,Integer> map = new HashMap<>(n/2);
        int min = Integer.MAX_VALUE;
        
        for(int i=1;i<n;i++)
            {
            if(A[i-1]==A[i])
                {
                map.put(A[i],min);
                
            }
        }
        for(Integer key : map.keySet())
            {
            int index1=-1;
            
            for(int i=0;i<n;i++)
                {
                if(key == C[i]) {
                    if(index1 == -1){index1=i;continue;}
                    int temp = map.get(key);
                    map.put(key,(i-index1));
                    index1=i;
                }
            }
            min = map.get(key) < min ? map.get(key) : min;
            
        }
        
        System.out.println(min);
    }
}



