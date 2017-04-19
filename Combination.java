package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Combination {
	
	   public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		   Scanner sc = new Scanner(System.in);
		   int N = sc.nextInt();
		   int [] input = new int[N];
		   for(int i=0;i<N;i++)
		   {
			   input[i]=sc.nextInt();
		   }
		   int k = 2;                             // sequence length  
		   List<int[]> subsets = new ArrayList<>();
		   int[] s = new int[k];                  // here we'll keep indices
		   
		   if (k <= input.length) {
			    // first index sequence: 0, 1, 2, ...
			    for (int i = 0; (s[i] = i) < k - 1; i++);  
			    subsets.add(getSubset(input, s));
			    for(;;) {
			        int i;
			        // find position of item that can be incremented
			        for (i = k - 1; i >= 0 && s[i] == input.length - k + i; i--); 
			        if (i < 0) {
			            break;
			        } else {
			            s[i]++;                    // increment this item
			            for (++i; i < k; i++) {    // fill up remaining items
			                s[i] = s[i - 1] + 1; 
			            }
			            subsets.add(getSubset(input, s));
			        }
			    }
			}
		   
		   for(int i=0;i<subsets.size();i++)
		   {
			   for(int j=0;j<subsets.get(i).length;j++)
			   {
				   System.out.print(subsets.get(i)[j]);
			   }
			   System.out.println();
		   }
		   
		   
	    }
		 // generate actual subset by index sequence
	   static int[] getSubset(int[] input, int[] subset) {
	       int[] result = new int[subset.length]; 
	       for (int i = 0; i < subset.length; i++) 
	           result[i] = input[subset[i]];
	       return result;
	   }
	   

}
