package hackerrank;

import java.util.Arrays;

public class Genericsstudy {
	
	public static class Sort <T extends Comparable<T>>{
		void insertionsort(T [] arr)
		{
			for(int i=1;i<arr.length;i++)
			{
				for(int j=i;j>0;j--)
				{
					if(arr[j-1].compareTo(arr[j])==1)
					{
						//swap
						T temp = arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
					else
						break;
				}
			}
			for(T i:arr)System.out.print(i+" ");
			System.out.println();
		}	
		
		
		
	}
	
	public static void quicksort(int []arr,int st,int end)
	{
		int actst=st;
		int actend=end;
		
		if(end-st<1)return;
		
		int mid = (st+end)/2;
		int pivot = arr[mid];
		
		while(st<=end)
		{
			while(st<end && arr[st]<pivot)st++;
			while(st<end && arr[end]>pivot)end--;
			
			if(st<=end)
			{
				int temp = arr[st];
				arr[st]=arr[end];
				arr[end]=temp;
				
				st++;
				end--;
			}
			
		}
		quicksort(arr,actst,end);
		quicksort(arr,st,actend);
		
		
	}
	
	
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
	
	
	
	public static <T,E> T mj(T x, E[] e)	
	{
		
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mj("kgakjdgasjkd",5);
		Sort x = new Sort();
		Integer [] arr = new Integer[]{3,2,7,5,2,2,3,4,5,12,34535,6,7876,29,6};		
		//x.insertionsort(arr);
		//for(int i:arr)System.out.println(i);	
	//	String []arrS = "a p p l i c a t i o n".split(" ");
		//x.insertionsort(arrS);*/
	/*	int [] qarr = new int[]{3,2,2};
		quicksort(qarr,0,qarr.length-1);
		for(int v:qarr)System.out.print(v+" ");		*/
		
		int [] qarr = new int[]{3,2,1,2};
		countSort(qarr,4,1);
		for(int v:qarr)System.out.print(v+" ");
	}

}
