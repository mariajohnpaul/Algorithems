package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SC5 {
	
	public static int ht = 0;
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		  Scanner sc = new Scanner(System.in);
		  
		  int N = sc.nextInt();
		  
		  int [] arr = new int[N];
		  Arrays.fill(arr, 0);
		  
		  //Root Node
		  int inp=sc.nextInt();
		  Node root = new Node(inp);
		  
		  for(int i=1;i<N;i++)
		  {
			  inp=sc.nextInt();
			  ht=0;
			  insert(root,inp);
			//  System.out.println(ht);
			  arr[ht]++;
			  
			  
		  }
		  int sum=0;
		  for(int i=1;i<N;i++)
		  {
			  sum=sum+i*arr[i];
		  }
		  System.out.println(sum);
		  
		  
	    }
	  
	  static class Node {
		    Node left;

		    Node right;

		    int value;

		    public Node(int value) {
		      this.value = value;
		    }
	  }
	  
	  public static void insert(Node node, int value) {
		  ht++;
		    if (value < node.value) {
		      if (node.left != null) {
		        insert(node.left, value);
		      } else {
		  /*      System.out.println("  Inserted " + value + " to left of "
		            + node.value);*/
		        node.left = new Node(value);
		      }
		    } else if (value > node.value) {
		      if (node.right != null) {
		        insert(node.right, value);
		      } else {
		      /*  System.out.println("  Inserted " + value + " to right of "
		            + node.value);*/
		        node.right = new Node(value);
		      }
		    }
		  }

}
