package week4.day2;

public class StaticBasics {
	
	int input=10; //Non-static varible
	static int data=20; //Static varibel

	
	public void nonstaticMethod() {
		System.out.println("I'm Non-static method");
		input = input + 10;
		System.out.println("My input value is "+input);
		
	}
	
	public static void staticMethod() {
		System.out.println("I'm static method");
		data = data+10;
		System.out.println("My data value is "+data);
	}
	
	public static void main(String[] args) {
	
		StaticBasics obj = new StaticBasics();
		obj.nonstaticMethod();
		
		StaticBasics.staticMethod();
		System.out.println("-------------------------------");
		StaticBasics.staticMethod();
		
		System.out.println("-------------------------------");
		
		StaticBasics obj2 = new StaticBasics();
		obj2.nonstaticMethod();
		StaticBasics.staticMethod();
		
		

	}
	
	
}
