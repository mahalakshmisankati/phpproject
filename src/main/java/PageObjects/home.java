package PageObjects;

import org.openqa.selenium.By;

import resources.base;

class home extends base {
	By myaccount = By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/a[1]");
	By signup = By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]");
	By firstname = By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/input[1]");
	By login=By.linkText("Login");
	By hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By flights=By.xpath("//li[@class='text-center active']//a[@class='text-center']");
	By tours=By.xpath("//li[@class='text-center active']//a[@class='text-center']");
	By cars=By.xpath("//li[@class='text-center active']//a[@class='text-center']");
	
	
	public void signupOption() {
		driver.findElement(myaccount).click();
		driver.findElement(signup).click();
		
	}
	public void loginOption() {
		
		driver.findElement(myaccount).click();
		driver.findElement(login).click();
		
	}

	public void hotel() {
		driver.findElement(hotel).click();	
	}
	public void flights() {
		driver.findElement(flights).click();
		
		
	}
	public void tours() {
		driver.findElement(tours).click();
		
		
	}
	public void cars() {
		driver.findElement(cars).click();
		
		
	}
	

}



