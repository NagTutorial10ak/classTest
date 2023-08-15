package week1.day2;

public class CheckNumberIsEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Check number is even or odd 
		//5 => ODD, 2=> EVEN , -1=> INVALID NUMBER
		
		int checkNumber = 4;
		
		if(checkNumber%2==0) {
			System.out.println("Number is EVEN");
		}
		else if(checkNumber%2!=0) {
			System.out.println("Number is ODD");
		}
		else {
			System.out.println("Number is INVALID");
		}
		
	}

}
