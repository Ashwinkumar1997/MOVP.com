package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="txtUsername")
	WebElement txtusername;
	
	@FindBy(name="txtPassword")
	WebElement txtpassword;
	
	@FindBy(name="Submit")
	WebElement Login;
	
	@FindBy(xpath="//a[.='Logout']")
	WebElement Logout;
	
	
	public void setuserName(String uname) {
		txtusername.sendKeys(uname);
	}
	
	public void setpass(String pass) {
		txtpassword.sendKeys(pass);
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public void clickLogout() {
		Logout.click();
	}

}
