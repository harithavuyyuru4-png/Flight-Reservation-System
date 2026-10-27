package com.list;

import java.util.ArrayList;
import java.util.List;

public class Testdemo3 {

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(6);
		li.add(3);
		li.add(1);
		li.add(0,10);
		li.add(2);
		li.add(5);
		li.add(1,20);
		li.add(4);
		System.out.println(li);

		
	}

}
