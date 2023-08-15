package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC implements RBI {

	public void knowYourCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Applied kyc");
		
	}

	public void withdrawLimit() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw limit is 10L");
		
	}

	public void fdrate() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw limit is 6%");
		
	}
	
	public void netBanking() {
		System.out.println("NetBanking applied to customer");
	}
	
	public static void main(String[] args) {
		
		HDFC objHDFC = new HDFC();
		objHDFC.knowYourCustomer();
		objHDFC.withdrawLimit();
		objHDFC.fdrate();
		objHDFC.netBanking();
		
		
		
		
	}

}
