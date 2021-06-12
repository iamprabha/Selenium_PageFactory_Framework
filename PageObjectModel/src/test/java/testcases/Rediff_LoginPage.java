package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.HomePage_PageFactory;

public class Rediff_LoginPage {

	
	
	@Test
	
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//implicit wait -driver will wait for 5 seconds globally.
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://www.amazon.com/?currency=INR&language=en_US");
	//	HomePage h=new HomePage(driver);
		HomePage_PageFactory h=new HomePage_PageFactory(driver);
		h.searchbox().sendKeys("groceries");
		h.searchbutton().click();
		driver.quit();
		
	}
	
	
	
}