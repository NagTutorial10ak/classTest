package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> list= driver.findElements(By.xpath("//input[contains(@class,'input')]"));
		//2 , WebElement 
		//1 , We
		
		list.get(0).sendKeys("Hello");
		list.get(1).sendKeys("ji");
	}

}
