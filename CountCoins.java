package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<52;i++)
		Arrays.fill(arr[i], -1);
		System.out.println(count(4,0,new ArrayList<Integer>(Arrays.asList(1,2))));

	}
	
	static int [][]  arr = new int[500][50]; 
	
	static Map<Integer,Integer> map = new HashMap<>();
	
	private static int count(int n,int i, ArrayList<Integer> coins) {
		// TODO Auto-generated method stub
		if(n<0 || i>=coins.size())return 0;
		if(n==0)return 1;
		
		if(!map.containsKey(hashcode(n,i)))
		//{
		//if(arr[n][i]==-1)
		{
		int sum=0;
		sum += count(n-coins.get(i),i,coins);
		sum += count(n,i+1,coins);
		arr[n][i]=sum;
		map.put(hashcode(n,i), sum);
		return sum;
		}
		else return map.get(hashcode(n,i));
		//else return arr[n][i]; 
	}
	
	static int hashcode(int a,int b)
	{
		int result = 17;
		result = 37*result+ String.valueOf(a).hashCode();
		result = 37*result+ String.valueOf(b).hashCode();		
		return result;
	}
	
}
