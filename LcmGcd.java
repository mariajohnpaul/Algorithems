package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class LcmGcd {
	
	public int gcd(int x, int y)
	{
		int temp = x%y;
		if(temp==0)return x;
		return gcd(y,temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LcmGcd mj =  new LcmGcd();
		//System.out.println(mj.gcd(20, 4));
		
		String [] genes = {"a","b", "c", "aa","d","b"};
		int health[] = {1,2,3,4,5,6};
		
		int first = 1;
        int last = 5;
        String d = "caaab";
        // your code goes here
        
        Map<String,Integer> rmap = new HashMap<>();
        
        int sumvalue = 0;
       
                    
            for(;first<=last;first++)
                {
                int index = d.indexOf(genes[first]);
                int count =0;
                while(index >=0)
                    {
                    count++;
                    index = d.indexOf(genes[first],++index);                        
                }
                
                 //if(rmap.get(genes[first]) != null)
                        {
                        //int value = rmap.get(genes[first]);
                        //int value= count*health[first];
                        //rmap.put(genes[first],value);
                       
                    }//else{
                      //  rmap.put(genes[first], count*health[first]);
                    //}                   
                sumvalue += count*health[first];;
            }
        //CALCULATE THE VALUE 
     //   max = sumvalue>max ? sumvalue : max;
     //   min = sumvalue<min ? sumvalue : min;   

	}

}
