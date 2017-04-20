package hackerrank;
import java.util.*;

import java.util.Map.Entry;



public class Comparator1 {
	
	
	
	public static void main (String [] Args)
	{
		
		Map <String , Integer > mp = new HashMap<>();
		
		mp.put("MJ", 1);
		mp.put("Medow", 2);
		mp.put("Alric", 3);
		mp.put("Tiffani", 4);
		mp.put("Auric", 5);
		mp.put("Tanya", 6);
		

		
		
		List <Map.Entry<String,Integer> > ls = new LinkedList<>();
		

		
		
		TreeMap<String,Integer> tm = new TreeMap<>(mp);
		
		Iterator ittm = tm.entrySet().iterator();
		
		while(ittm.hasNext())
		{
			Map.Entry<String, Integer> mo = (Entry<String, Integer>) ittm.next();
			System.out.println(mo.getKey()+mo.getValue());
			ls.add(mo);
		}
		
		Collections.sort(ls,new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2 ){
				
				if(o1.getValue()<o2.getValue())
				{
					return -1;
				}
				
				
				return 1;
				
			}
			
		});
		
		
		Iterator<Entry<String, Integer>> it = ls.iterator();
		while(it.hasNext())
		{
			Map.Entry ob = it.next();
			System.out.println(ob.getValue()+"  "+ob.getKey());
		}
		
		List<Integer> la = new ArrayList<>();
		int i=5;
		while(i-->0)la.add(i);
		la.add(4);
		Iterator itarray = la.iterator(); 
		while(itarray.hasNext())
		{
			if(itarray.next()==Integer.valueOf(4))
			{
				itarray.remove();
			}
		}
		itarray = la.iterator();
		while(itarray.hasNext())
		{
			System.out.println(itarray.next());
		
		}
		
		
		
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(6);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(2);
		removeDuplicates(a);
		
	}	
	
	
public static int removeDuplicates(ArrayList<Integer> A) {
	    
	   int index = 1;
	    int count = 1;
	    int n = A.size();
	    
	    for (int i = 1; i < n; i++) {
	        if (A.get(i).intValue() == A.get(i - 1).intValue() && count < 2) {
	            A.set(index, A.get(i));
	            count++;
	            index++;
	        } else if (A.get(i).intValue() != A.get(i - 1).intValue()) {
	            A.set(index, A.get(i));
	            count = 1;
	            index++;
	        }
	    }
	    
	    
	    return index;
	}
	

	

}


