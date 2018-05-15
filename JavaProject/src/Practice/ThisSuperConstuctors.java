package Practice;

class SuperSuperComstructor{
 public SuperSuperComstructor()
 {
	 System.out.println("super super class contructor");
 }
}

class SuperConstructor extends SuperSuperComstructor {
	public SuperConstructor()
	{
		System.out.println("super class constructior");
	}
}
public class ThisSuperConstuctors extends SuperConstructor{
	public ThisSuperConstuctors()
	{
		//this();
		System.out.println("child class constructior");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThisSuperConstuctors thisSuperContructor=new ThisSuperConstuctors();
		SuperConstructor superConstructor=new SuperConstructor();

	}

}
