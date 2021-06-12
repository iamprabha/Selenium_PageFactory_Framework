package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageFactory {

	WebDriver driver;
	
	public HomePage_PageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	
	//By searchbox=By.id("twotabsearchtextbox");
	//By searchbutton=By.id("nav-search-submit-button");
	
	
	public WebElement searchbox()
	{
	//	return driver.findElement(searchbox);
		return searchbox;
	}
	
	public WebElement searchbutton()
	{
	//	return driver.findElement(searchbutton);
		return searchbutton;
		
	}
	
	
}
