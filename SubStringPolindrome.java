package hackerrank;
import java.util.*;

public class SubStringPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //public Set<String> palindromes(final String input) 
		
		String input = "abaaa";
		
		{

		     final Set<String> result = new HashSet<>();

		     for (int i = 0; i < input.length(); i++) {
		         // expanding even length palindromes:
		         expandPalindromes(result,input,i,i+1);
		         // expanding odd length palindromes:
		         expandPalindromes(result,input,i,i);
		     } 
		     //
		     for(String x: result)
		     {
		    	 System.out.println(x);
		     }
		  }

		 
	}
	
	 static public void expandPalindromes(final Set<String> result, final String s, int i, int j) {
	      while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
	            result.add(s.substring(i,j+1));
	            i--; j++;
	      }
	  }


}
