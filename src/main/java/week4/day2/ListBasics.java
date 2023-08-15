package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		//ADD elements into the list, 0-> pra,1->re, 2->el, 3->Yes
		list.add("Praveen");
		list.add("Revanth");
		list.add("Elaversan");
		list.add("Yeswanth");
		
		int listSize= list.size();
		
		System.out.println("Size of list is "+listSize);
		
		String listFirstIndex = list.get(1);
		System.out.println("2nd element in list "+listFirstIndex);
		
		list.remove(3);
		
		System.out.println("Size of list is "+list.size()); //3
		
		
		//PRINT ALL ELEMENT IN LIST //3
		
		//0, 0<=3
		//1, 1<=3 -> Re
		//2 , 2<=3 Ele
		//3 , 3<=3 
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(" "+list.get(i));
			
		}
		
		List<String> list2 = new ArrayList<String>();
		list2.add("nagaraj");
		list2.add("Mut");
		
		list.addAll(list2);
		
		System.out.println("                               ");
		
for(int i=0;i<list.size();i++) {
			
			System.out.println(" "+list.get(i));
			
		}
		
		

	}

}
