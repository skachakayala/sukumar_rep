package testEx;

public class CloneEx implements Cloneable{
	int id=10;
	String name="sukumar";
	
	
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static final void main(String[] args) throws CloneNotSupportedException {
		CloneEx c1 = new CloneEx();
		
		CloneEx c2 = (CloneEx) c1.clone();
		System.out.println(c1.id+" "+c1.name);
		System.out.println(c2.id+" "+c2.name);
		
		
	}

}
