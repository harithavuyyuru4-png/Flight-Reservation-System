package com.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSetDemo {


		

			public static void main(String[] args) {
				 NavigableSet<Integer> ns = new TreeSet<>();
						 ns.add(600);
						 ns.add(500);
						 ns.add(400);
						 ns.add(300);
						 ns.add(100);
						 ns.add(1200);
						 ns.add(1000);
						System.out.println(ns);
						System.out.println(ns.ceiling(500));
						System.out.println(ns.higher(500));
						 System.out.println(ns.lower(400));

				
			}

	

}
