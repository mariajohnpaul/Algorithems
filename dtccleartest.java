package hackerrank;

public class dtccleartest {
	
	public static void main (String [] args)
	{
		
		//tEST 1 y=initial+x Positive
		double initial = -45.00000000000001;
		double x= 50; //start x
		double rollx = 55;		
		double endx = 60;
		testoutput(initial,x, rollx,endx);
	}
	
	
	public static void testoutput(double initial,double x,double rollx,double endx)
	{
		double PreY = initial+x-1;
		
		for(double i=x;i<endx;i++,x++)
		{
			if(x==rollx)x=0;
			System.out.println("Input..Initial "+initial+" Dongle Post X value "+x+" Previous returned Odo value Y "+PreY);
			
			double Y1;
			if((initial +x)<PreY)
			{
				if(x<=0) Y1= PreY;
				else
				{
					initial = PreY;
					Y1 =initial+x;
					
				}
			}else{
				Y1= initial+x;
			}
			
			PreY = Y1;
			
			System.out.println("Expect..Initial "+initial+" New Odo value Y "+PreY);
		}
		
	}

}
