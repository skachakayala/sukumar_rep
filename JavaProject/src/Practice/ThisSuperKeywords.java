package Practice;


class Super
{
	int a=100;
	String name="sukumar";
	public void display()
	{
		System.out.println("superclass display()");
		System.out.println(a+"...."+name);
		System.out.println(this.a+"...."+this.name);
		//System.out.println(super.a+"...."+super.name);
	}
}
public class ThisSuperKeywords extends Super {

	int a=10;
	String name="s2tech";
	public void display()
	{
		System.out.println("child display()");
		System.out.println(a+"...."+name);
		System.out.println(this.a+"...."+this.name);
		System.out.println(super.a+"...."+super.name);
		super.display();
		//this.display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisSuperKeywords thisSuperKeywords=new ThisSuperKeywords();
		thisSuperKeywords.display();
		
		//System.out.println(this.a+"...."+this.name);
		//System.out.println(super.a+"...."+super.name);
	}

}
