package eu.dauphine.rayanPrevost.td5.javaAvancee;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Panel 1");
		Iterator<Integer> it = Panel.panel1(1,5);
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("");
		System.out.println("Panel 2");
	
		for(int i : Panel.panel2(1,5)) {
			System.out.println(i);
		}
		System.out.println("");
		System.out.println("Panel");
		List<Integer> list = Panel.panel(3,6);
		for(int i : list) {
			System.out.println(i);
			
		}
		System.out.println(list.get(1));
	}


}
