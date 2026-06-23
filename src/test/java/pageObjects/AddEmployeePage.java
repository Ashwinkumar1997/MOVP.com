package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	WebDriver ldriver;
	
	public AddEmployeePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By PIMlink=By.xpath("//b[.='PIM']");
	By addemployeebutton=By.xpath("//a[.='Add Employee']");
	

}
