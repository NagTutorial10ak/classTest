package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConstrcutorBasics {
	
	public ConstrcutorBasics() {
		System.out.println("This is default contrcutort created by user");
	}
	
	
	public ConstrcutorBasics(String name) {
		System.out.println("Parameterized constrcutor with name as arg "+name);
	}
	
	public ConstrcutorBasics(int num) {
		System.out.println("Parameterized constrcutor with num as arg "+num);
	}
	
	public ConstrcutorBasics(String name, int num) {
		System.out.println("Parameterized constrcutor with num and anmeas arg "+name +"and" +num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
		options.addArguments("--headless");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		
		
	}

}
