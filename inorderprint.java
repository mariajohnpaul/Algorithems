package hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class inorderprint {

	static public class Node{
		char value;
		Node left;
		Node Right;
		Node(char x)
		{
			this.value=x;
		}

		public static Node insertLeft(Node nd,char value){
			
			return nd.left = new Node(value);
			
		}
		public static Node insertRight(Node nd,char value){
			return nd.Right=new Node(value);
		}
		
	}
	
	public static void main(String[] args){
		char[] arr= "welcome".toCharArray();
		Node head=new Node(arr[0]);
		Queue<Node> qu = new LinkedList<>();
		qu.add(head);
		for(int i=2;i<arr.length;i+=2)
		{
			Node temp=qu.poll();
			qu.add(Node.insertLeft(temp,arr[i]));
			qu.add(Node.insertRight(temp,arr[i-1]));	
			
			if(i==(arr.length-2))
			{
				qu.add(Node.insertLeft(temp,arr[i+1]));
			}
		}
		
		//display
		Queue<Node> q = new LinkedList<>();
		q.add(head);
		while(!q.isEmpty())
		{
			Node te = q.poll();
			if(te != null){
			q.add(te.left);
			q.add(te.Right);
			System.out.print(te.value+" ");
			}
			
		}
		
	}
	
	
}
