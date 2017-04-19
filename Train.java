package hackerrank;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Train {
	
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    
		  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int M = sc.nextInt();//col
	  int K = sc.nextInt();//no of tracks
	  Map<Integer, ArrayList<Integer>> grid = new HashMap<>();
	  for(int i=0;i<K;i++)
	  {
		  int r = sc.nextInt();
		  int c1 = sc.nextInt();
		  int c2 = sc.nextInt();
		  
		  if(c1>c2)
		  {
			  int temp = c2;
			  c2=c1;
			  c1=temp;
		  }
		  
		  
		
		  if(!grid.containsKey(r))
		  {		  
		
			  
			  ArrayList<Integer> ar = new ArrayList<>();
			  ar.add(c1);
			  ar.add(c2);
			  grid.put(r, ar);
			  
		  }else{
			  
			  ArrayList<Integer> ar = grid.get(r);
			  
			 boolean modified = false;
			  for(int z=0;z<ar.size();z=z+2)
			  {				  
				  if(c1<=ar.get(z)&& c2>=ar.get(z))
				  {
				  ar.set(z, c1);	
				  modified = true;
				  }
				  if(c2>=ar.get(z+1) && c1 <= ar.get(z+1))
				  {
				  ar.set(z+1, c2);
				  modified = true;
				  }
				  
			  }
			  if(!modified)
			  {
				 
				  
					  ar.add(c1);
					  ar.add(c2);
					  modified = false;
				  
			  }
			//  Collections.sort(ar);
			  //remove overlap with in
			  int prst = ar.get(0);
			  int prend = ar.get(1);
			  for(int z=2;z<ar.size();z=z+2)
			  {	
				  if(ar.get(z)<=prend)
				  {
					  int temp = ar.get(z+1);
					  
					  if (temp >= prend)
					  {
						  ar.remove(z-1);
						  ar.remove(z-1);
						  prend = temp;
					  }else
					  {
						  ar.remove(z+1);
						  ar.remove(z-1);
					  }
				  }
				 
			  }
			  
			  
			  grid.put(r, ar);
			  
		  }
	  }
	  
	  
	  long ans = (long) (N*M);//total grid
	  for(Entry<Integer, ArrayList<Integer>> entry : grid.entrySet())
	  {
		  ArrayList<Integer> temp = entry.getValue();
		  int length=0;
		  for(int z=0;z<temp.size();z=z+2)
		  {
		  length += temp.get(z+1)-temp.get(z)+1;
		  }
		  ans-=length;
	  }
	  System.out.println(ans);
	  
	  }


}
