package week4.day2;

public class MemoryManagement {
	
	String name="This is Non-Static";
	static int data = 5;
	int nonStaticData =5;
	
	public void sum() {
		nonStaticData = nonStaticData+5;
		System.out.println("Printing data in non-static method "+nonStaticData); //10
		data =data+5;
		System.out.println("Printing data in non-static method  adding num "+ data);
	}
	public static void age() {
	//	System.out.println("Printing data in non-static method "+nonStaticData);
	//	System.out.println("Pringinf name in non-static " +name);
		data = data+10;
		System.out.println("Printing data in static method  adding num "+ data);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MemoryManagement mgmt= new MemoryManagement();
		
		mgmt.sum();
		age();
		System.out.println("===========================");
		MemoryManagement mgmt1= new MemoryManagement();
		mgmt1.sum();
		age();
	}

}
