package PageObjects;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignUp {

	WebDriver driver;
	Properties prop;
	Logger l=Logger.getLogger("SignUp");
	
	By FirstName = By.xpath("//input[@placeholder='First Name']");
	By LastName = By.xpath("//input[@placeholder='Last Name']");
	By MobileNumber = By.xpath("//input[@placeholder='Mobile Number']");
	By Email = By.xpath("//input[@placeholder='Email']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By ConfirmPassword = By.xpath("//input[@placeholder='Confirm Password']");
	By Cookie = By.cssSelector("button[id='cookyGotItBtn']");
	By btn = By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
	
	
	public SignUp(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void RegistrationPage() throws Exception
	{
		prop = new Properties();
		PropertyConfigurator.configure("C:\\\\ag\\\\MyProject\\\\src\\\\main\\\\java\\\\resources\\\\log4j.properties");
		FileInputStream fis = new FileInputStream("C:\\ag\\MyProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		driver.findElement(FirstName).sendKeys(prop.getProperty("Fname"));
		driver.findElement(LastName).sendKeys(prop.getProperty("Lname"));
		driver.findElement(MobileNumber).sendKeys(prop.getProperty("mobile_no"));
		driver.findElement(Email).sendKeys(prop.getProperty("email"));
		driver.findElement(Password).sendKeys(prop.getProperty("password"));
		driver.findElement(ConfirmPassword).sendKeys(prop.getProperty("cnf_password"));
		
		driver.findElement(btn).sendKeys(Keys.ENTER);
		
	}	
}
