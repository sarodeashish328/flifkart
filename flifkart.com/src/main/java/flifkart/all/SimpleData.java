package flifkart.all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleData {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--disable-notifications");
	 
	WebDriver driver = new ChromeDriver(option);
	
	// driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
	
	 
	 driver.get("https://www.flipkart.com/");
	 
	 
	 System.out.println( driver.getTitle());
	 
	 WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	// login.click();
	 
	Thread.sleep(2000);
	 WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	 user.sendKeys("7218201965");
	
	 WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	 pass.sendKeys("Flipkart123");
	 
	 WebElement clicklogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	 clicklogin.click();
	 
	 
	 
	}
}
