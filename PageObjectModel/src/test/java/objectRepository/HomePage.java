package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}
	
	By searchbox=By.id("twotabsearchtextbox");
	By searchbutton=By.id("nav-search-submit-button");
	
	
	public WebElement searchbox()
	{
		return driver.findElement(searchbox);
		
	}
	
	public WebElement searchbutton()
	{
		return driver.findElement(searchbutton);
		
	}
	
	
}
