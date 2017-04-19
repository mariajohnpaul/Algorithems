package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Circlecombination {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        //int[] r = new int[n];
        ArrayList<Integer> sarr = new ArrayList<>(n);
        for(int r_i=0; r_i < n; r_i++){
            sarr.add(in.nextInt());
        }
        // Write Your Code Here
        //find possibility of all K compination and average the area 12345
        double ans = combination(sarr,(n-k));
        
        System.out.println(ans/count);
        
        for(ArrayList<Integer> v : dp.keySet())
        {
        	System.out.println(v+" "+dp.get(v)); 
        }
        
        
    }
    public static double area (long r)
        {
        return (Math.PI*r*r);
    }
    
    private static int count =0;
    private static Map<ArrayList<Integer>,Double> dp = new LinkedHashMap<>(10000);
    public static double combination(ArrayList<Integer> sarr, int k)
        {
    if(sarr.size()==k)
        {
        long sum=0;
        double ans=0;
       // System.out.println(darr+" "+sarr);       
        for(int v:sarr)
        ans +=area(v);  
        count++;
        //dp.put(key, ans);
        return ans;
    }
        
        if(sarr.size()<1)return 0;
        
         
        if(dp.get(sarr) != null) 
        	{
        	int tcou=1;
        	for(int d=sarr.size();d>k;d--)
        		tcou*=d;	
        		count+=tcou;
        	return dp.get(sarr);
        	}
        
        double ans = 0;
        
        for(int i=0;i<sarr.size();i++)
            {
            for(int j=i+1;j<sarr.size();j++)   
                {
            ArrayList<Integer> nsarr = new ArrayList<>(sarr);
            int el1=sarr.get(i);
            int el2=sarr.get(j);
            nsarr.set(i,(el1+el2));
            nsarr.remove(j);
            System.out.println(nsarr);
            double value = combination(nsarr,k);
            ans += value;
            dp.put(nsarr, value);
        }
        }
        return ans;
    }
}
