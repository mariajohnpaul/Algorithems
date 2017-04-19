package hackerrank;

public class Singleton implements Comparable{
	
	private static Singleton instance;
	int value;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getinstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
