package TestPackage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.CarSearch;
import resources.base;

public class ValidateCarSearch extends base{

	@BeforeTest
	public void preConditions() throws Exception
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void CheckCarSearch() throws IOException
	{
		CarSearch c = new CarSearch(driver);
		c.Search();
		driver.close();
	}
}
