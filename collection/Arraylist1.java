package collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();
		//add method
		
		cities.add("london");
		cities.add("india");
		cities.add("singapore");
		cities.add(2,"delhi");
		//print size of the data
		
		System.out.println(cities.size());
		
		for(String t: cities) {
			System.out.println(t);
		}

	}

}
