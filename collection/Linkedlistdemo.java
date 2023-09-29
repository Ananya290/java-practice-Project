package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("london");
		cities.add("india");
		cities.add(2,"singapore");
		cities.add("delhi");
		
      System.out.println(cities.size());
      
      Iterator itr = cities.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
    	  System.out.print(cities.get(1));
    	  System.out.println(cities.contains("hyderadad"));
      }
		
      


	}

}
