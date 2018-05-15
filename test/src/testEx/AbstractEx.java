package testEx;

public abstract class AbstractEx {
	public void noAbstract()
	{
		System.out.println("non abstarct");
	}
	
	public static int returnValue()
	{
		 try
	        {
	            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
	            return 20;
	        }
	        finally
	        {
	            return 50;
	        }
		 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractEx abs=new AbstractEx();
		System.out.println(returnValue());
	       
	}

}
