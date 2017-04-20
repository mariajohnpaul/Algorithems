package hackerrank;

import java.util.Arrays;

public class MatrixRotation {
	
	public static void rotate(int[][]arr)
	{
		int length = arr[0].length-1;
		for(int R=0,C=0; R<length/2;R++,C++)
		{
			int l= length-R;
			
			for(int k=0;k<=l/2;k++)
			{
				int temp = arr[R+k][C+l];
				arr[R+k][C+l]=arr[R][C+k];
				
				int temp2 = arr[R+l][C+l-k];
				arr[R+l][C+l-k] = temp;
				
				
				temp = arr[R+l-k][C];
				arr[R+l-k][C] = temp2;
				
				arr[R][C+k] = temp;
				
				
			}
			
		}
		for(int i=0;i<arr[0].length;i++)
		System.out.println(Arrays.toString(arr[i]));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		rotate(arr);

	}

}
