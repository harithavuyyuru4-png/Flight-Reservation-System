package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testdemo2 {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(8);
		l.add(67);
		l.add(33);
		l.add(15);
		 Collections.sort(l);
		System.out.println(l);
	}

}
