package hackerrank;

import java.io.*;
import java.util.*;

public class Solution7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        
        long arr[] = new long[k];
        while(n-- >0)
        {
        	long val = sc.nextLong();
        	val = val%k;
        	arr[(int) val]++;      	
        	
        	
        	
        }
        
        
        long count = 0 ;
        if(arr[0]>0)count=1;
        
        for(int i=1,j=k-1;i<=j;i++,j--)
        {
        	
        	count+= arr[i]>arr[j] ? arr[i] :arr[j];
        	
        	if(i==j & arr[i]>1){count-=arr[i];count++;}
        }
       
        
        System.out.println(count);
    }
}