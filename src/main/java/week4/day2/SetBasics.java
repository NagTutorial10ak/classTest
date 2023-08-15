package week4.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class SetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> set = new TreeSet<String>();
		
		set.add("praveen"); 
		set.add("yeswanth");
		set.add("elevarsan"); 
		set.add("revanth");
		set.add("naga");
		
		System.out.println("size of the set "+ set.size());
		
		set.remove("naga");
		
		System.out.println("size of the set "+ set.size());
		
		
		//CONVERT SET TO LIST
		
		List<String> list = new ArrayList<String>();
		
		list.addAll(set);
		System.out.println("Size of list " + list.size());
		
		//PRINT ALL ELEMENTS IN LIST
		
		for(int i=0;i<list.size();i++) {
			System.out.println("Printing list has=== "+list.get(i));
		}
		
		ChromeDriver driver = new ChromeDriver();
		driver.getWi
		
	}

}
