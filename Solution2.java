package hackerrank;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


//Definition for singly-linked list.
 class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }
 
public class Solution2 {
	static ListNode a;
	
	public static ListNode detectCycle(ListNode a) {
	    
	    try{
	    
	    if(a.next == null) return null;
	    if (a.next.next == null)return null;
	    ListNode single = a;
	    ListNode even = a.next.next;
	    int count =0;
	    

	    
	    
	    while(even.next.next != null)
	    {
	        
	        
	        if (single == even)
	        {
	            //cycle detected
	            //find the circle length 
	            ListNode detect = single;
	            System.out.println(single.val);
	            int circlelength = 1;
	            single = single.next;
	            //while(single!=detect){circlelength++;single = single.next;}
	            ListNode chk = a;
	            while(chk.next != null)
	            {
	            if(chk== detect || chk== detect.next)
	            {
	            	if (chk == detect.next )
		            {
		                return detect;
		            }else //chk == detect.next
		            {
		                detect = detect.next;
		                chk=a;
		            }
	            }else
	            {
	               chk = chk.next;
	            }
	            }
	            
	            
	        }else
	        {
	            count++;
	            single = single.next;
	            even = even.next.next;
	            
	        }
	        
	        
	    }
	    }
	    catch (Exception e)
	    {
	        
	    }
	    return null;
	}
	
	public static int majorityElement(final ArrayList<Integer> A) {
		
		Collections.sort(A);
		
		//Collections.binarySearch()
		long x= 3;
		long b=0;
		int lo=32;
		while (lo-- >0){
			  b<<=1;
			  b|=( x &1);
			  x>>=1;
			}
		
		System.out.println(Integer.toBinaryString((int) b));
		
		Queue <Integer> q = new LinkedList<Integer>();
		
		q.add(444);
		q.add(3333);
		q.add(0000);
		q.add(9999);
		while(!q.isEmpty())System.out.println(q.remove());
		
		for(int i=0;i<A.size();i++)
		{
			System.out.println(A.get(i));
		}
		
		
	    
	    if (A == null)
	        return -1;
	        
	    int maj = A.get(0);
	    int count = 1;
	    int n = A.size();
	    
	    for (int i = 1; i < n; i++) {
	    	int no=A.get(i);
	        if (A.get(i) == maj) {
	            count++;
	        } else if (count == 1) {
	            maj = A.get(i);
	        } else {
	            count--;
	        }
	    }
	    
	    count = 0;
	    
	    for (int i = 0; i < n; i++) {
	        if (A.get(i) == maj)
	            count++;
	    }
	    
	    if (count > n / 2)
	        return maj;
	        
	    return -1;
	    
	    
	}
	public static void main (String [] args)
	{
		a = new ListNode(0);
		ListNode tmp = a;
		int [] arr = {4,1,2,3};
		ListNode three = null;
		ListNode six;
		for(int i=0;i<arr.length;i++)
		{
			tmp.next = new ListNode(arr[i]);
			tmp=tmp.next;
			if(arr[i]==4)three = tmp;
			if(arr[i]==3)tmp.next=three;
		}
		
		//tmp = detectCycle(a);
		//System.out.println(tmp.val);
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(1);
		A.add(1);
		
		A.add(1);
		int xor=A.get(0);
		for(int i=1;i<A.size();i++)
			xor^=A.get(i);
		System.out.println(xor);
			
		int ans = majorityElement(A);
		
		
	}
}
