package hackerrank;

import java.util.ArrayList;
import java.util.*;

public class sol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack st = new Stack();
		
		int[] prices = {3,2,1};
		
		int []discount = new int[prices.length];
		
		int small = prices[prices.length-1];
		discount[prices.length-1]=0;
		st.push(prices.length-1);
		int total = prices[prices.length-1];
		
		for(int i=prices.length-2;i>=0;i--)
		{
			if(prices[i]>=prices[i+1])
			{
				small = prices[i+1];
				total = total+prices[i]-small;
				
			}
			else if(prices[i]>=small)
			{
				total = total+prices[i]-small;
				
			}else
			{
				total = total+prices[i];
				small = prices[i];
				st.push(i);
				
			}
		}
		
		System.out.println(total);
		
		Iterator it = st.iterator();
		
		int sz =st.size();
		for(int i=0;i<sz;i++)
		{
			System.out.print(st.pop()+" ");
		}
		
	}

}
