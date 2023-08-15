package week1.day3;

public class ArraysLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {10,20,30,40,50,60}; 
		
		//Find length
		//ctrl+2 ,L 
		int length = scores.length;
		System.out.println(length);
		
		//Second
		
		System.out.println(scores[5]);
		
		//Each element of array
		//0, 0<=6, 1,1<=6...5;5<=6,,6,6<6
		for(int i=0; i<scores.length; i++) {
			
			System.out.println(scores[i]); //scores[0]=>10,scores[1]=>20, scores[5]=60
		}
		
		String[] name = new String[3];
		name[0]="Praveen";
		name[1]="Elevarsan";
		name[2]="Yeswanth";
		
	}

}
