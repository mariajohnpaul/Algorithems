package hackerrank;

public class PolindromeList {
	
	static class Node{
		
		char data;
		Node next;
		
	}
	
	static public void main(String[] args)
	{
		char [] arr =  "RADAR".toCharArray();
		
		Node head = new Node();
		
		Node current = head;
		Node prev = head;
		
		for(char c:arr)
		{
			current.data = c;
			current.next = new Node();
			prev=current;
			current=current.next;				
		}	
		prev.next = null;
		
		System.out.println(isPolindrome(head));
		
	
	}

	private static boolean isPolindrome(Node head) {
		// TODO Auto-generated method stub
		int len=0;
		Node current = head;
		//find the len
		while(current!=null){ 
			System.out.println(current.data);
			current=current.next;
			len++;
		}
		System.out.println(len);
		boolean odd = len%2 == 0 ? false : true ;
		
		len=len/2;
		//reverse till mid
		Node prev = null;
		current = head;
		for(int i=0;i<len;i++)
		{
			Node temp = current;
			current=current.next;
			temp.next=prev;;
			prev= temp;
		}
		
		Node Mid = current;
		if(odd)current=current.next;
		
		boolean flag = false;
		Node forw = Mid;
		while(current!=null) 
		{
			if( current.data != prev.data) flag=true;
			Node temp = prev;
			prev=prev.next;
			temp.next=forw;
			forw=temp;
			current=current.next;
		}
		
		current = head;
		while(current!=null){ 
			System.out.println(current.data);
			current=current.next;
			//len++;
		}
		
		return !flag;
	}

}
