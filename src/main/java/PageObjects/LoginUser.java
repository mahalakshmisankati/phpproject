package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUser {

	WebDriver driver;
	Properties prop;
	Logger l=Logger.getLogger("LoginUser");
	
	By Email = By.xpath("//input[@placeholder='Email']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By Submit = By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
	By Cookie = By.cssSelector("button[id='cookyGotItBtn']");
	
	public LoginUser(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LoginPage() throws IOException
	{
		prop = new Properties();
		PropertyConfigurator.configure("C:\\ag\\MyProject\\src\\main\\java\\resources\\log4j.properties");
		FileInputStream fis = new FileInputStream("C:\\ag\\MyProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		driver.findElement(Email).sendKeys(prop.getProperty("email"));
		driver.findElement(Password).sendKeys(prop.getProperty("password"));
		driver.findElement(Submit).click();
	}
}
