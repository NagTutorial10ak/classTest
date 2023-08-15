package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="praveen";
		String reverse = "";
		
		for(int i= name.length()-1; i>=0; i-- )
		{
			char charAt = name.charAt(i);  //n , e,e
			reverse = reverse+ charAt; //""+n = n, n+e=ne,ne+e=nee
			
			
		}
		System.out.println(reverse);

	}

}
