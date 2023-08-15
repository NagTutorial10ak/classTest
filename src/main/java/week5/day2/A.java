package week5.day2;
public class A{
	int x=10;
	public void run(){
		System.out.println("inside A");
	}
	
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x);
		obj.run();
	}
}

class B extends A{
	int x=20;
	public void run(){
		System.out.println("inside b");
	}
	
	
}