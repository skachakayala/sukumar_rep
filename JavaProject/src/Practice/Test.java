package Practice;

public class Test {
	
	public void emailValidation(String emailId)
	{
		int index=0;
		int totallengthOFEmail =  emailId.length();
		String StringInEmail=null;
		if(emailId.charAt(0)!='@'&& (emailId.charAt(totallengthOFEmail-1)!='@'))
		{
			System.out.println("Email id should not start or end with @ symbol");
		}
		else
		{
			
					for(int i=0;i<emailId.length()-1;i++)
					{
						if(emailId.charAt(i)=='@')
						{
							break;
							
						}
						else
						{
							System.out.println("@ symbole not exist in EmailID");
						}
						index=i;
					}
					
						
					 StringInEmail = emailId.substring(0, index);		
				
			}
			System.out.println("Email before @ is "+StringInEmail);
		
	}
	
	public void switchExample(String name)
	{
		switch(name)
		{
		case "sukumar":
		System.out.println("welcome "+name);
		break;
		
		case "sai":
			System.out.println("welcome "+name);
			
		}
	}
	

		

	}

