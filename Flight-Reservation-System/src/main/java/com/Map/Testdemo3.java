package com.Map;
//WAP TO PRINT THE FREQUENCY OF THE GIVEN CHARRACTERS IN A GIVEN NUMBERS

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testdemo3 {

	public static void main(String[] args) {
		Map<Character,Integer>map=new HashMap<>();
		System.out.println(map);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		char[]ch=str.toCharArray();//j a v a
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
				
			}else {
				map.put(c,1);
			}

	        System.out.println("Character frequencies: " + map);

	        int max = 0;
	        char maxChar = ' ';

	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

	            if (entry.getValue() > max) {
	                max = entry.getValue();
	                maxChar = entry.getKey();
	            }
	        }

	        System.out.println("Highest frequency character: " + maxChar);
	        System.out.println("Highest frequency count: " + max);
	    }
	
		}

}
