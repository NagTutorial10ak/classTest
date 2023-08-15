package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//ENTER USERNAME, PASSWORD, 
		
		WebElement userName = driver.findElement(By.name("USERNAME"));
		userName.sendKeys("DemoSalesManager");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		//CLICK ON LOGIN
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	

}
