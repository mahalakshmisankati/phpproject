package TestPackage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SignUp;

import junit.framework.Assert;
import resources.base;

public class ValidateSignUpPage extends base{

	By MyAccount = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By SignUp = By.linkText("Sign Up");
	
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
		SignUp su = new SignUp(driver);
		HomePage v = new HomePage(driver);
		Assert.assertTrue(v.MyAccount().isDisplayed());
		driver.findElement(MyAccount).click();
		driver.findElement(SignUp).click();
		
		su.RegistrationPage();
		/*Thread.sleep(6000);
		LogOut l = new LogOut(driver);
		l.BackToHomePage();*/
		
		log1.info("Successfully Signup Page");
		
	}

}
