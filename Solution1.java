package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	
	String chip = sc.nextLine();
	String key = sc.nextLine();
	
	String firstline = "";
	String secondline = "";
	String thirdline = "";
	
	String []words = key.split(" ");
	
	int stindex=0;
	int cost = chip.length()+words.length-1;
	int prev = 0;
	for(String find : words)
	{
		
		int sind = chip.indexOf(find,stindex);
		if(sind>=0)
			{
			stindex=sind+1;
			
			secondline = secondline + find+" "+sind+" "+(sind+find.length()-1)+" ";
			//System.out.println(secondline);
			
			//cost
			
			if(prev>sind)
			{
				int diff = find.length()-(prev-sind+1);
				cost-=diff;
				
				int add = prev -sind+1;
				cost+=add;
			}else
			{
				cost = cost - find.length();
			}
			prev = (sind+find.length()-1);
			//cost fin
			
			}else
			{
				firstline = "NO";
				thirdline = "0";		
			}
		
		
		
	}
	
	//System.out.println(cost);
	if(!thirdline.contains("0"))
	{
	thirdline = Integer.toString(cost);
	}
	
	if(firstline.isEmpty())
	{
		firstline = "YES";
		
		
	}
	System.out.println(firstline);
	if(secondline.isEmpty())secondline="0";
	System.out.println(secondline);
	System.out.println(thirdline);
	
	}

}
