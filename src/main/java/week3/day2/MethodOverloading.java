package week3.day2;

public class MethodOverloading {
	
	
	//Perform addition of number
	
  public void add(int a, int b) {
		
		int sum = a+b;
		
		System.out.println("Sum is :" +sum);
	}
	
  public void add(int a, int b,int c) {
		
		int sum = a+b+c;
		
		System.out.println("Sum is :" +sum);
	}

  
  public void add(int a, String b) {
		
		
		
		System.out.println("Sum is :" +a+b);
	}

	
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  MethodOverloading obj = new MethodOverloading();
	  
	  obj.add(1, 2);
	  obj.add(1, 2, 3);
	  obj.add(1, "abc");
	  obj.add(3, 6);
	  obj.add(1, 'a');
	}

}
