package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		
		Alert alert = driver.switchTo().alert();
		driver.switchTo().fra
		//Maximize browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node019c64r5r7p8h0oxcw1vdecdin258255.node0");
		
		driver.switchTo().frame(0);
		
		WebElement clickButton = driver.findElement(By.id("Click"));
		clickButton.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame442");
		WebElement clickButton2 = driver.findElement(By.id("Click"));
		clickButton2.click();
		
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
