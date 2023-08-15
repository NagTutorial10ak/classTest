package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThisBaisc extends Parent  {

	
public  ThisBaisc() {
	
	System.out.println("This is child contrcutor");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.switchTo().frame("abc");
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("Click")).click();
				
	}

}

class Parent{
	
 public Parent(){
	 System.out.println("This is parent contrcutor");
	 
 }
	
}
