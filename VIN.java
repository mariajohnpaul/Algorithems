package hackerrank;

import java.util.*;

public class VIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[]{ 87,68,67,84,71,52,68,66,50,72,74,50,56,48,54,57,51};
		
		for(int i : arr)
		{
			System.out.print(Character.valueOf((char) i));
			char c = (char)i;
			
			
		}
	
        for(int i:arr)    
		System.out.printf("%x ",i);

	}

}
