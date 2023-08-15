package week4.day1;

public class CanaraTPT extends CanaraHQ {

	@Override
	public void cardOperations() {
		// TODO Auto-generated method stub
		System.out.println("Card operations");
		
	}

	@Override
	public void goldLoan() {
		// TODO Auto-generated method stub
		System.out.println("gold loan at 10%");
		
	}
	
	public void penOperation () {
		System.out.println("Pen provide");
	}

	
	public static void main(String[] args) {
		
		CanaraTPT objCan = new CanaraTPT();
		objCan.cardOperations();
		objCan.goldLoan();
		objCan.penOperation();
	}
}
