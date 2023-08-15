package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		opts.addArguments("--start-maximized");

		ChromeDriver driver = new ChromeDriver(opts);

		/*
		 * driver.get("https://www.myntra.com/shirts?rawQuery=shirts");
		 * 
		 * WebElement ele =
		 * driver.findElement(By.xpath("//span[text()='Recommended']"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.moveToElement(ele).perform();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.close();
		 * 
		 * 
		 */

		/*
		 * driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 * 
		 * WebElement ele =
		 * driver.findElement(By.xpath("//span[text()='right click me']"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.contextClick(ele).perform();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.close();
		 */
		
		/*
		 * driver.get(
		 * "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		 * 
		 * //Switch to frame
		 * 
		 * driver.switchTo().frame("iframeResult");
		 * 
		 * WebElement ele = driver.findElement(By.
		 * xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.doubleClick(ele).perform();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.close();
		 */
		  
		/*
		 * driver.get("https://leafground.com/drag.xhtml");
		 * 
		 * 
		 * WebElement eleSource =
		 * driver.findElement(By.xpath("//span[text()='Drag me around']")); WebElement
		 * eleDest = driver.findElement(By.xpath("//p[text()='Drop here']"));
		 * 
		 * Point location = eleSource.getLocation(); int x = location.x; int y =
		 * location.y; System.out.println("xaxies"+x +"yasix"+y);
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.dragAndDropBy(eleSource, 50, 150).perform();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.close();
		 */
		
		
		/*
		 * driver.get("https://www.redbus.in/");
		 * 
		 * 
		 * WebElement eleSource =
		 * driver.findElement(By.xpath("//ul[@class='containerHome clearfix']/li"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.scrollToElement(eleSource).perform();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.close();
		 */
		 
		
		/*
		 * driver.get("https://leafground.com/drag.xhtml");
		 * 
		 * 
		 * WebElement eleSource =
		 * driver.findElement(By.xpath("(//td[text()='Bracelet'])[2]"));
		 * 
		 * WebElement eleDes =
		 * driver.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.clickAndHold(eleSource).moveToElement(eleDes).release().perform();
		 * 
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.close();
		 */
		 
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL+"C").keyUp(Keys.CONTROL+"a").perform();
		act.keyDown(Keys.TAB).keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();

	}

}
