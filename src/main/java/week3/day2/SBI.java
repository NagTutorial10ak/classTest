package week3.day2;

public class SBI extends RBI {
	
	
	public void fdrate() {
		System.out.println("CURRENT FD RATE IS 6.2%");
	}

	public static void main(String[] args) {
		
		SBI objSBI = new SBI();
		objSBI.fdrate();
		
		RBI objRbi = new RBI();
		objRbi.fdrate();
	}

}
