package hackerrank;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] arr = "cAda".toCharArray();
		int cou=0;
		for(char c:arr)cou+=c;
		System.out.println(cou);
		
		char[] arr2 = "AbrAcadA".toCharArray();
		int ans=0;
		
		int index =0;
		for(int i=0;i<=(arr2.length-arr.length);i++)
		{
			int nec=0;
			for(int j=i;j<i+arr.length;j++)
			{
				nec+=arr2[j];
			}
			if(nec==cou)ans++;
			
		}
		System.out.println(ans);
	}

}
