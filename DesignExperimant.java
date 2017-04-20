package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DesignExperimant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= new int[]{3,2,1,5};			
		Arrays.sort(arr);
		
		for(int i=arr.length-1,j=0;i>=arr.length/2;i--,j++)
		{
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			
		System.out.println(Arrays.toString(arr).replace("[","").replace("]", "").replace(",", "").replace(" ", ""));
		
		ArrayList<Integer> newarr = new ArrayList<>(Arrays.asList(3,2,1,5));		
		Collections.sort(newarr,new Comparator <Integer> (){
			
			public int compare(Integer o1,Integer o2)
			{
				if(o1<o2)return 1;
				return -1;
			}
		});
		System.out.println((newarr));
		

	}

}
