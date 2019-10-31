package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;
	
	By MyAccount = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement MyAccount() 
	{
		return driver.findElement(MyAccount);
	}
}
