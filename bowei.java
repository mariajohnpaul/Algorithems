package hackerrank;

public class bowei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vin = "49,71,49,74,69,54,83,66,56,70,52,49,57,49,54,55,48";
		
		String vinc = "2C4RC1CG8FR676191";
		
		String [] mj = vin.split(",");
		
		
		for(String i : mj)
		{
			int ac = Integer.valueOf(i);
			System.out.print(Character.toString((char)ac));
			
		}
		System.out.println();
		for(String i:mj)System.out.printf("%x, ",Integer.valueOf(i));
		
		//vinc DECODE
		System.out.println();
		for(int i=0;i<vinc.length();i++)
		{
			System.out.printf("%x, ",'0'+(vinc.charAt(i)-'0'));
		}
		
		
	}

}
