package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {

	WebDriver driver;
	
	By Account = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By LogOut = By.xpath("//a[@class='dropdown-item tr']");
	By ReturnHome = By.xpath("//a[contains(text(),'Home')]");
	
	public LogOut(WebDriver driver)
	{
		this.driver = driver;
	}
	public void BackToHomePage()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(Account).click();
		driver.findElement(LogOut).click();
		driver.findElement(ReturnHome).click();
		
		driver.close();
	}
}
