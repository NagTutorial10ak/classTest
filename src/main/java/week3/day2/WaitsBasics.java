package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		WebElement createAcct = driver.findElement(By.partialLinkText("Create new account1"));
		createAcct.click();
		
		
		
		WebElement enterUserName = driver.findElement(By.name("firstname"));
		enterUserName.sendKeys("FirstName");

	}

}
