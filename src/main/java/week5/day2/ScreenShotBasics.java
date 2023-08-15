package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotBasics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Daily Quiz']"));
		
//		File src = ele.getScreenshotAs(OutputType.FILE);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File des = new File("./screenShots/img1.jpeg");
		
		FileUtils.copyFile(src, des);
		
		
		
	}

}
