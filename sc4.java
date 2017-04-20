package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sc4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	//int []arr1 = new int[N];
    	ArrayList<Integer> zeroarr = new ArrayList<>();
    	
    	for(int i=0;i<N;i++)
    	{
    		int inp=sc.nextInt();
    		if(inp==0)
    		{
    			zeroarr.add(i);
    		}
    	}
    	
    	while(M-->0)
    	{
    		int inp=sc.nextInt();
    		if(inp==1)
    		{
    			//query k 
    			int k = sc.nextInt();
    			if(k>zeroarr.size())
    			{
    				System.out.println("NO");
    				
    			}else
    			{
    				
    				System.out.println(zeroarr.get(k-1));    				
    				
    			}
    			
    			
    		}else
    		{
    			int p=sc.nextInt();
    			int val=sc.nextInt();
    			if(val==0  )
    			{
    				if(!zeroarr.contains(p))
    				{
    					//insert
    					int i=0;
    					for(;i<zeroarr.size();i++)
    					{
    						if(p>zeroarr.get(i))
    						{
    							break;
    						}
    					}
    					zeroarr.add(i,p);
    				}
    				
    			}
    			else if(zeroarr.contains(p) && val!=0)
    			{
    				int index=zeroarr.indexOf(p);
    				zeroarr.remove(index);
    			}
    		}
    	}
    	
    	
    	
    }
}