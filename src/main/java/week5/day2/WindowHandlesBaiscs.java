package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesBaiscs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://leafground.com/window.xhtml;jsessionid=node01aurz1u934l1m1mkwxmv5tbq3a265064.node0");

		
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String title2 = driver.getTitle();
		System.out.println("My current title "+title2);
		System.out.println("**************************************");
		
		driver.findElement(By.xpath("//button/span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//convert set to list
		
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		
		driver.switchTo().window(list.get(1));
		
		System.out.println("**************************************");
		String title = driver.getTitle();
		System.out.println("My current title "+title);
		
		driver.findElement(By.xpath("//span[text()='Daily Quiz']/preceding::div[1]")).click();
		
		driver.quit();
		
		driver.switchTo().window(list.get(0));
		String text = driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']")).getText();
		System.out.println("My text is "+text);
		
		
		
	
		
		
	}

}
