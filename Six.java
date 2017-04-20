package hackerrank;

import java.io.*;
import java.util.*;

public class Six {
	
	static long a[] = new long[4];

/*	public static void main(String [] args)
	{

	Scanner sc = new Scanner (System.in);

	String s = sc.next();


	char [] arr = s.toCharArray();

	long x=0;
	for(char c : arr)
	{

	x= ((c-'0')+x)%3;
	a[(int) x]++;  //Counts Number of String divided by 3 modulo 
	}

	x=0;
	long ans=0;

	for(char c : arr)
	{
	ans=ans+a[(int) x];
	x= (x+(c-'0'))%3;
	a[(int)x]--;
	}
	
	System.out.println(ans);

	}	*/
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        // your code goes here
        int count = 0;    
        int [] arrmod = new int[4];
        
        char [] arr = s.toCharArray();      
       
        int x=0;
        for(int i=0;i<s.length();i++)
            {
            x = x + arr[i]-'0';
            if((arr[i]-'0')%2==0) arrmod[(x%3)]++;
        }
        x=0;
         for(int i=0;i<s.length();i++)
            {
            count += arrmod[x];
            int temp = arr[i]-'0';
             x= (x+temp)%3;
             if(temp%2==0)arrmod[temp%3]--; 
        }
        
        
        System.out.println(count);
    }   
	

}
