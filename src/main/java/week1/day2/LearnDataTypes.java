package week1.day2;

public class LearnDataTypes {
	//Global 
	 int myCarNumber = 123; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnDataTypes obj = new LearnDataTypes();
		obj.myLocalMethod(); //25
//		obj.myLocalMehod2(); //6,133
//		
//		
//			System.out.println("My class In glbla variable "+obj.myCarNumber);
//		
//		
//			obj.myCarNumber = obj.myCarNumber +10;  //143
//		
//		obj.myLocalMehod2(); //6,143
		
	}
	
	public void myLocalMethod() {
		
		//Local variable
         int age = 25;
         char geneder = 'M';
         boolean isCompitable = true;
		
		System.out.println("My age "+age);
		System.out.println("Gender is "+geneder);
		System.out.println("My compitable "+isCompitable);
		
	
	}
	
	public void myLocalMehod2() {
		
        int height = 6;
        
		
		System.out.println("My height "+height);
		
		myCarNumber = myCarNumber +10;
		System.out.println("My class variable "+myCarNumber); //153
		
	
	}
	
	//123 => 133

}
