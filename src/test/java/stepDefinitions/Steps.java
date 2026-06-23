package stepDefinitions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@SuppressWarnings("deprecation")
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\MOVP.com\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		lp= new LoginPage(driver);
		
	    
	}

	@When("User opens url {string}")
	public void user_opens_url(String url)
	{
	    driver.get(url);
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) 
	{
	    lp.setuserName(username);
	    lp.setpass(password);
	}

	@When("click on Login")
	public void click_on_login() 
	{
	    lp.clickLogin();
	}

	@Then("Page title should be displayed")
	public void page_title_should_be_displayed() 
	{
		if(driver.findElement(By.xpath("//a[.='Dashboard']")).isDisplayed())
		{
			System.out.println("User successfully logged in");
		}else {
			System.out.println("User successfully not logged in");
			
		}
	   
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() 
	{
		driver.findElement(By.xpath("//a[.='Welcome Md']")).click();
	    lp.clickLogout();
	}

	@Then("Page title login should be displayed")
	public void page_title_login_should_be_displayed() 
	{
		if(driver.findElement(By.xpath("//input[@name='Submit']")).isDisplayed())
{
	System.out.println("User successfully logged off");
}else{
	System.out.println("User successfully not logged off");
}
	   
	}

	@Then("close the browser")
	public void close_the_browser() 
	{
		driver.close();
	    
	}

           
}
