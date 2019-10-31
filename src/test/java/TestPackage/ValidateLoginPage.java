package TestPackage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LogOut;
import PageObjects.LoginUser;
import junit.framework.Assert;
import resources.base;

public class ValidateLoginPage extends base{

	By MyAccount = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By Login = By.linkText("Login");
	By msg = By.xpath("//h3[@class='text-align-left']");
	
	
	@BeforeTest
	public void preConditions() throws Exception
	{
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void CheckHomePage() throws Exception
	{
		HomePage v = new HomePage(driver);
		LoginUser l = new LoginUser(driver);
		Assert.assertTrue(v.MyAccount().isDisplayed());
		driver.findElement(MyAccount).click();
		driver.findElement(Login).click();
		l.LoginPage();
		Assert.assertEquals("Hi, maha sankati" ,driver.findElement(msg).getText());
		log1.info("Successfully Logged in");
		Thread.sleep(6000);
		LogOut lo = new LogOut(driver);
		lo.BackToHomePage();
		
		log1.info("Successfully verified Logout Page");
		
	}
}
