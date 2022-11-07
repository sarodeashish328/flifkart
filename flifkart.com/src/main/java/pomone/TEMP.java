package pomone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TEMP {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		
		
//======================loginpage====================================
		
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println("login page display ="+ user.isDisplayed());
		user.sendKeys("sarodeash28@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("ashish28");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		Thread.sleep(5000);
//========================mainpage===========================================
		WebElement myProfile = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]"
				+ "/div[1]/span[1]/div[1]/div[1]/div[1]/svg[1]/g[1]/image[1]"));
		Thread.sleep(3000);
		myProfile.click();
		WebElement logOut = driver.findElement(By.xpath("//span[text()='Log Out']"));
		logOut.click();
		
		
		}

}
