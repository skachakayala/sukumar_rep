package testEx;

public class SingletonEx {
	private static SingletonEx ref;
	private SingletonEx()
	{
		
	}
	public static SingletonEx getInstance()
	{
		if(ref==null)
		{
			ref = new SingletonEx();
		}
		return ref;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
