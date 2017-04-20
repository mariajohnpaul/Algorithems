package hackerrank;

import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		String	str = "587";
		permutation("", str);*/
		
	/*	Set<Integer []> ans = getPermutationsRecursive(new Integer[]{5,8,7});
		
		for(Integer[] e:ans){
			for(int el:e)System.out.print(el+" ");
			System.out.println();
		}*/
		
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		mjperm(new ArrayList<Integer>(){},input);
		for(ArrayList<Integer> p:set)System.out.println(p);
		
	}
	
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

	
	public static Set<Integer[]> getPermutationsRecursive(Integer[] num){
	    if (num == null)
	        return null;

	    Set<Integer[]> perms = new HashSet<>();

	    //base case
	    if (num.length == 0){
	        perms.add(new Integer[0]);
	        return perms;
	    }

	    //shave off first int then get sub perms on remaining ints.
	    //...then insert the first into each position of each sub perm..recurse

	    int first = num[0];
	    Integer[] remainder = Arrays.copyOfRange(num,1,num.length);
	    Set<Integer[]> subPerms = getPermutationsRecursive(remainder);
	    for (Integer[] subPerm: subPerms){
	        for (int i=0; i <= subPerm.length; ++i){ // '<='   IMPORTANT !!!
	            Integer[] newPerm = Arrays.copyOf(subPerm, subPerm.length+1);
	            for (int j=newPerm.length-1; j>i; --j)
	                newPerm[j] = newPerm[j-1];
	            newPerm[i]=first;
	            perms.add(newPerm);
	        }
	    }

	    return perms;
	}
	
	static Set<ArrayList<Integer> > set = new LinkedHashSet<>();
	static void mjperm(ArrayList<Integer> prefix, ArrayList<Integer> remaining)
	{		
	
		if(remaining.size() == 0){set.add(prefix);}
		else{
			
		for(int i=0;i<remaining.size();i++)
		{
			ArrayList<Integer> newprefix = new ArrayList<Integer>(prefix);				
			ArrayList<Integer> newremaining =  new ArrayList<Integer>(remaining);
			newprefix.add(newremaining.get(i));
			newremaining.remove(i);			
			mjperm(newprefix,newremaining);
		}
		}
			
	}
	
	
}
