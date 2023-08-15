package week1.day3;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String name = "Hello";
		String check = "Hello";
		String name_2 = new String ("Hello");
		String check_2 = new String("Hai");
		
		if(name==name_2)  // False
			System.out.println("IT'S TRUE");
		else
			System.out.println("IT'S FALSE");
		
		
		System.out.println();
		
		if(name==check) // True
			System.out.println("IT'S TRUE");
		else
			System.out.println("IT'S FALSE");
		
		System.out.println();
		
		if(name.equals(name_2))  //True
			System.out.println("IT'S TRUE");
		else
			System.out.println("IT'S FALSE");
		
		System.out.println();
		
		if(name.equals(check_2)) //False
			System.out.println("IT'S TRUE");
		else
			System.out.println("IT'S FALSE");
		
		System.out.println();
		
		//Find length
		
		int len = name.length();
		System.out.println("Lenght of string: "+len);
		
		//lowercase
		
		String lowerCase = name.toLowerCase();
		System.out.println("Lenght of string: "+lowerCase);
		
		//Contains
		char a ='1';
		name.contains(lowerCase);
		
		char myChar =name.charAt(1);
		System.out.println("character at position 1: "+myChar);
		
	
	
	}

}
