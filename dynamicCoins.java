package hackerrank;

public class dynamicCoins {
	
	static int []c = new int[52];
	static int numCoins;
	static long [][] table = new long[52][252];
	static boolean[][] calculated= new boolean[52][252];
	static long solve(int i, int make)
	{
	    if(make<0) return 0;
	    if(make==0)return 1;
	    if(i > numCoins) return 0;
	    if(calculated[i][make] == false){ //eliminating overlap
	        table[i][make] = solve(i, make - c[i]) + solve(i+1, make);
	        calculated[i][make] = true;
	    }
	    return table[i][make];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int make = 4;
	    numCoins=2;
	    int [] inp = new int[]{1,2};
	    for(int i=1;i<=numCoins;i++){
	        c[i]=inp[i-1];
	    }
	    System.out.println(solve(1, make));
	    return;

	}

}
