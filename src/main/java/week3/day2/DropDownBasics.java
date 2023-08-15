package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		
		  driver.get("http://leaftaps.com/opentaps/control/login");
		  
		  WebElement userName = driver.findElement(By.id("username"));
		  userName.sendKeys("DemoSalesManager");
		  
		  WebElement passWord = driver.findElement(By.id("password"));
		  passWord.sendKeys("crmsfa");
		  
		  WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		  submit.click();
		  
		  WebElement clickCRMSFA = driver.findElement(By.partialLinkText("CRM/SFA"));
		  clickCRMSFA.click();
		  
		  WebElement clickLeads = driver.findElement(By.linkText("Leads"));
		  clickLeads.click();
		  
		  WebElement clickCreateLeads = driver.findElement(By.linkText("Create Lead"));
		  clickCreateLeads.click();
		  
		  
		  WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		  
		  Select select = new Select(source);
		  
		  //select.selectByVisibleText("Employee"); //select.selectByIndex(4);
		  
		  List<WebElement> list = select.getOptions();
		  
		  //PRINT ALL drop-down values //12 > webelement
		  
		  //0, 0<object
		  
		  for(int i=0;i<list.size();i++) {
			  
			  WebElement element =list.get(i); 
			  
			  System.out.println(element.getText());
		  }
		 
//		driver.get("https://leafground.com/select.xhtml");
//		
//		WebElement selectCountry = driver.findElement(By.xpath("//label[text()='Select Country']"));
//		selectCountry.click();
//		
//		WebElement selectIndia = driver.findElement(By.xpath("//li[text()='India']"));
//		selectIndia.click();

	}

}
