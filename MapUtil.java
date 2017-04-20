package hackerrank;

import java.util.*;



class MapUtil extends Exception{
	
static Set<Integer> calcset = new HashSet<>();
	
public static void add()
{
	
/*	int [][] arr = new int[2][3];
	
	int R= arr.length;
	int C=arr[0].length;
	System.out.println(R + " "+ C);*/
	
	String [] sarr = "A + B".split(" ");
	System.out.println(sarr.length);
	
	if(sarr[0].contains("A"))
		System.out.println(sarr[0]+(sarr[0].length()));
	System.out.println("A"+("A".length()));
	
	ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(10,11,12,13,14));
	
	int i=4;
	while(x.size()>0)
	{		
	x.remove(i);
	i--;
	System.out.println(x.toString());
	}
	
	Map<Integer,Integer> map = new HashMap<>();
	map.put(1, 2);
	map.put(2, 2);
	ArrayList<Integer> arr = new ArrayList<>(map.keySet());
	
	for(int v:arr)System.out.println(v);
	
	
	
/*	Set<Integer> unsol =  new HashSet<>();
	
	unsol.add(1);
	unsol.addAll(Arrays.asList(2,3,4,5));
	
	unsol.remove(3);
	
	Iterator<Integer> it = unsol.iterator();
	while(!unsol.isEmpty())
	{
		if(it.hasNext()){
		int a =it.next();
		//unsol.remove(it);
		
		System.out.println(a);
		
		if(a==5)break;}
		
	}
	
	for(int v:unsol)System.out.println(v);*/
}
	
public static void main(String [] args)
{
	add();
}
	
}