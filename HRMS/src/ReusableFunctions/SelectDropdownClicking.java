package ReusableFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseEngine.DriverEngine;

public class SelectDropdownClicking {
	//static WebDriver driver;
	public static void selectDropdown(WebElement ele,String selectablevalue)
	{
		//driver = DriverEngine.getDriver();
		Select select = new Select(ele);
		select.selectByVisibleText(selectablevalue);
	}

}
