package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Testdemo2 {

	public static void main(String[] args) {
		Collection<String>boys=new ArrayList<>();
		boys.add("dhoni");
		boys.add("dhoni");
		boys.add("dhoni");
		boys.add("dhoni");
		boys.add("dhoni");
		System.out.println(boys);
		Collection<String>girls=new ArrayList<>();
		girls.add("anu");
		girls.add("anu");
		girls.add("abhi");
		girls.add("anu");
		girls.add("anu");
		System.out.println(girls);
		Collection<String>Students=new ArrayList<>();
		Students.addAll(boys);
		Students.addAll(girls);
		Students.remove("abhi");
		Students.removeAll(boys);
		System.out.println(Students);

		

	}

}
