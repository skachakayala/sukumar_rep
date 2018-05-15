package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hrms {
	WebDriver driver;
	//login
	public void login()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.0.3.3/HRMSLogin.aspx");
		driver.findElement(By.id("txtEmployeeId")).sendKeys("HDC7352");
		driver.findElement(By.id("txtPassword")).sendKeys("ammananna");
		driver.findElement(By.id("btnSubmit")).click();
	}
	public void homPage()
	{
		driver.findElement(By.partialLinkText("Home")).click();
	}
	//hours of Employee
	public void hoursOfEmployee()
	{
		Actions act=new Actions(driver);
		WebElement mainMenu=driver.findElement(By.id("link9"));
		WebElement subMenu=driver.findElement(By.cssSelector("#menuItemHilite22"));
		WebElement subMenu2=driver.findElement(By.cssSelector("#menuItemHilite17"));
		act.moveToElement(mainMenu).moveToElement(subMenu).moveToElement(subMenu2).click().build().perform();
		Select select=new Select(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_ddlPeriod")));
		select.selectByVisibleText("Pay Period");
		driver.findElement(By.cssSelector("#ctl00_HRMSDefault_btnShow")).click();
		System.out.println("Employee ID\tEmployee name\tdate\tIn time\tout Time\tTotalhours\tIndide hours");
		for(int i=2;i<5;i++)
		{
			System.out.print(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvSwipe_ctl0"+i+"_lblEmployeeID")).getText()+"\t\t");
			System.out.print(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvSwipe_ctl0"+i+"_lblName")).getText()+"\t\t");
			System.out.print(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvSwipe_ctl0"+i+"_lblDate")).getText()+"\t\t");
			System.out.print(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvSwipe_ctl0"+i+"_lblIntime")).getText()+"\t\t");
			System.out.print(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvSwipe_ctl0"+i+"_lblOuttime")).getText()+"\t\t");
			System.out.print(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvSwipe_ctl0"+i+"_lblDuration")).getText()+"\t\t");
			System.out.print(driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvSwipe_ctl0"+i+"_lblInside")).getText()+"\t\t");
			System.out.println();
		}
		
	}
	
	public void leavebalanceSummary()
	{
		Actions act=new Actions(driver);
		WebElement mainMenu=driver.findElement(By.id("link9"));
		WebElement subMenu1=driver.findElement(By.cssSelector("#menuItemHilite21"));
		WebElement subMenu2=driver.findElement(By.cssSelector("#menuItemHilite15"));
		act.moveToElement(mainMenu).moveToElement(subMenu1).moveToElement(subMenu2).click().build().perform();
		System.out.println("Leave Type\tLeave Entitled(Days)\tLeave Taken (Days)\tLeave Remaining(Days) ");
		/*WebElement 
		#ctl00_HRMSDefault_GVLeaveSummary_ctl02_lblLeaveTyp
		#ctl00_HRMSDefault_GVLeaveSummary_ctl02_lblLeaveEntitled
		#ctl00_HRMSDefault_GVLeaveSummary_ctl02_lblLeaveTaken
		#ctl00_HRMSDefault_GVLeaveSummary_ctl02_lblLeaveTaken
		
		
		#ctl00_HRMSDefault_GVLeaveSummary_ctl03_lblLeaveType
		#ctl00_HRMSDefault_GVLeaveSummary_ctl03_lblLeaveEntitled
		#ctl00_HRMSDefault_GVLeaveSummary_ctl03_lblLeaveTaken
		#ctl00_HRMSDefault_GVLeaveSummary_ctl03_lblLeaveTaken
		*/
		
		System.out.println("Earned leave details");
		System.out.println("====================");
		System.out.println("Leave Entitled :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl02_lblLeaveEntitled")).getText());
		System.out.println("Leave taken(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl02_lblLeaveTaken")).getText());
		System.out.println("Leave remaining(days) :"+driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td/div/table/tbody/tr[2]/td[4]/span")).getText());
		System.out.println();
		
		System.out.println("Optional Holiday details");
		System.out.println("====================");
		System.out.println("Leave Entitled :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl03_lblLeaveEntitled")).getText());
		System.out.println("Leave taken(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl03_lblLeaveTaken")).getText());
		System.out.println("Leave remaining(days) :"+driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td/div/table/tbody/tr[3]/td[4]/span")).getText());
		System.out.println();
		
		System.out.println("Loss of Pay details");
		System.out.println("====================");
		System.out.println("Leave Entitled :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl04_lblLeaveEntitled")).getText());
		System.out.println("Leave taken(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl04_lblLeaveTaken")).getText());
		System.out.println("Leave remaining(days) :"+driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td/div/table/tbody/tr[4]/td[4]/span")).getText());
		System.out.println();
		
		System.out.println("Comp off details");
		System.out.println("====================");
		System.out.println("Leave Entitled :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl05_lblLeaveEntitled")).getText());
		System.out.println("Leave taken(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl05_lblLeaveTaken")).getText());
		System.out.println("Leave remaining(days) :"+driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td/div/table/tbody/tr[5]/td[4]/span")).getText());
		System.out.println();
		
		
		
		System.out.println("On Duty details");
		System.out.println("====================");
		System.out.println("Leave Entitled :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl06_lblLeaveEntitled")).getText());
		System.out.println("Leave taken(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl06_lblLeaveTaken")).getText());
		System.out.println("Leave remaining(days) :"+driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td/div/table/tbody/tr[6]/td[4]/span")).getText());
		System.out.println();
		
		System.out.println("ForgotSwip card details");
		System.out.println("====================");
		//System.out.println("Leave Entitled :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl07_lblLeaveEntitled")).getText());
		System.out.println("Leave taken(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl07_lblLeaveTaken")).getText());
		//System.out.println("Leave remaining(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl07_lblLeaveTaken")).getText());
		System.out.println();
		
		System.out.println("Maternity Leave details");
		System.out.println("====================");
		//System.out.println("Leave Entitled :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl08_lblLeaveEntitled")).getText());
		System.out.println("Leave taken(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl08_lblLeaveTaken")).getText());
		//System.out.println("Leave remaining(days) :"+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_GVLeaveSummary_ctl08_lblLeaveTaken")).getText());
		System.out.println();
	}
	
	//Conference room booking
	public void bookingConferenceRoom()
	{
		Actions act=new Actions(driver);
		WebElement mainMenu=driver.findElement(By.id("link13"));
		WebElement subMenu1=driver.findElement(By.cssSelector("#menuItemHilite14"));
		//WebElement subMenu2=driver.findElement(By.cssSelector("#menuItemHilite15"));
		act.moveToElement(mainMenu).moveToElement(subMenu1).click().build().perform();
		
		//driver.findElement(By.id("ctl00_HRMSDefault_lnkcreate")).click();
		driver.findElement(By.id("ctl00_HRMSDefault_lnkview")).click();
		int i=2;
		boolean recordExist;
		do
		{
			
			recordExist=driver.findElements(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblReserved")).size()!=0;
			if(recordExist)
			{
				System.out.println("reserved by: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblReserved")).getText());
				System.out.println("start date: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblstart")).getText());
				System.out.println("end date: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblEnd")).getText());
				System.out.println("start time: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblStime")).getText());
				System.out.println("End time: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblEtime")).getText());
				System.out.println("Room booked is: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblRoom")).getText());
				i++;
				recordExist=driver.findElements(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblReserved")).size()!=0;
			
			}else
			{
				System.out.println("no bookings exist");
				recordExist=false;
			}
			
			
					
		}while(recordExist);
	
		
		/*while(driver.findElements(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblReserved")).size()!=0)
		{
			if(driver.findElements(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblReserved")).size()==0)
			{
				System.out.println("no bookings exist");
			}
			else
			{
				System.out.println("reserved by: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblReserved")).getText());
				System.out.println("start date: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblstart")).getText());
				System.out.println("end date: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblEnd")).getText());
				System.out.println("start time: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblStime")).getText());
				System.out.println("End time: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblEtime")).getText());
				System.out.println("Room booked is: "+driver.findElement(By.cssSelector("#ctl00_HRMSDefault_gvconference_ctl0"+i+"_lblRoom")).getText());
				
			}
			i++;
		
		}*/
		//System.out.println("welcome"+driver.findElement(By.cssSelector(".bg_middle>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr>td")).getText());
		
	}
	//closing browser	
	public void closeBrowser()
	{
		try{
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Logout")).click();
		}catch(Exception e){System.out.println(e);}
	}
	
}
