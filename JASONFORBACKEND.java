package hackerrank;

import java.util.*;

public class JASONFORBACKEND {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		StringBuilder sb = new StringBuilder();
		
		String inp = "";
		
		while(true)
		{
			
		inp = sc.nextLine();
		if(inp.contains("Q"))break;
		
		int st= inp.indexOf("(0x");
		int stp = inp.indexOf(")");
		
		String byt = inp.substring(st+3, stp);
		
		sb.append(("00"+byt).substring(byt.length()));
		
		//System.out.println(byt);
		}
		
		
		System.out.println(sb.toString());
*/		
	/*	String arr[] = {"22","32", "11"};
		
		
		
		Arrays.sort(arr,new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				if(arg0.length()<arg1.length())return -1;
				
				for(int i=0;i<arg0.length();i++)
				{
					if(Integer.valueOf(arg0.charAt(i)) < Integer.valueOf(arg1.charAt(i)))
						return -1;
				}
				
				
				return 0;
			}
			
		});
		
		System.out.println(arr[0]);*/
		
		/*int[] query = {1,3,5,10};
		
		String[] answer = {"Odd","Odd","Odd","Even"};
		System.out.println(reveal(query,answer));*/
		
		
		String e = "863434637546053606670042064966363960616664130696000632330096300463669690047902869039890073066006969623660702001906406662430606030086204390769306935293";
		
		Long le = Long.valueOf(e);
		System.out.println(le);
		
		
		
		String S = "1C3CDFBH5DD641803";
		
		for(int i=0;i<S.length();i++)
		{
			/*int inp = 0;
			if(S.charAt(i) < 'A')
		       inp = S.charAt(i)+'0';
			else
				inp = S.charAt(i)-'A';*/
			System.out.printf("%X ",Integer.valueOf(S.charAt(i)));
			
		}

	}
	
	public static int reveal(int[] query, String[] answer) {
		int ans = -1;
		boolean trac = false;
		for (int i = 0; i < query.length; i++) {
			if (trac) {
				trac = false;
				if (query[i] % 2 == 0) {
					if (answer[i].contains("Odd")) {
						ans = i;
					}
				} else {
					if (answer[i].contains("Even")) {
						ans = i;
					}
				}
			}

			if (answer[i].contains("Odd")) {
				trac = true;
			}
		}
		if (ans == -1) {
			if (query[0] % 2 == 0 && answer[0].contains("Odd"))
				ans = 0;
			if (query[0] % 2 == 1 && answer[0].contains("Even"))
				ans = 0;
		}
		
		if(ans== -1 && answer[0].contains("Odd") )ans=0;
		
		return ans;

	}
	
	
	public static  int fix(String[] graph){
		return 0;
		
		
		
	}

}
