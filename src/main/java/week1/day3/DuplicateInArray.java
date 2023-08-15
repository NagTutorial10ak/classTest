package week1.day3;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WAP to duplicate element in array
		//output 10,30
		
		int[] scores = {10,20,30,30,40,10,50};
		
		for(int i=0;i<scores.length; i++ ) { //i=0;0<6, i=1;1<6;i=2
			
			
			for(int j = i+1;j<scores.length; j++) //j=1;1<6; 2<6;3<6;4<6;5<6;6<6; 2;2<6;3<66>6
			{
				if(scores[i]==scores[j]) {
					System.out.println("Duplicate is "+scores[i]);
				}
			}
		}
		
		
	}

}
