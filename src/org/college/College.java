package org.college;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	public void first() {
System.out.println("first");
	}
	public void second() {
		System.out.println("second");

	}

	public static void main(String[] args) {
		College c = new College();
		c.first();
		c.second();

		List<String>a=new ArrayList<>();
		a.add("fa");
		a.add("moh");
	
		for (String string : a) {
			System.out.println(string);
		}
		
			System.out.println("Changes made here is in same branch");
		}
	

}





