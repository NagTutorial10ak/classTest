package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node01s97kphjbeqj15o69b794a56s253302.node0");
		
		WebElement simpleAlert = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
		simpleAlert.click();
//		
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		WebElement confirmationText = driver.findElement(By.id("simple_result"));
		String name = confirmationText.getText();
		System.out.println(name);
		
		WebElement simpleAlert2 = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
		simpleAlert2.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement confElement2 = driver.findElement(By.id("result"));
		String text2 = confElement2.getText();
		System.out.println(text2);
		

		WebElement simpleAlert3 = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		simpleAlert3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Learning");
		alert3.accept();
		
		WebElement confElement3 = driver.findElement(By.id("confirm_result"));
		System.out.println(confElement3.getText());
		
		
		
		
		
		
	}

}
