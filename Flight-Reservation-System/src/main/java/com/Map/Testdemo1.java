package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testdemo1 {

	public static void main(String[] args) {
Map<String,String>map=new HashMap<>();
map.put("TG","Telangana");
map.put("AP", "Andhra Pradesh");

map.put("KA", "Karnataka");
map.put("TN", "Tamil Nadu");
map.put("KL", "Kerala");
map.put("MH", "Maharashtra");
map.put("UP", "Uttar Pradesh");
map.put("RJ", "Rajasthan");
map.put("GJ", "Gujarat");
map.put("MP", "Madhya Pradesh");
System.out.println(map);                          /////for getting the actual flower braces
Set<Entry<String,String>>entries=map.entrySet();
System.out.println(entries);                      /////for getting the square braces
for(Entry<String,String>entry:entries) {
	System.out.println(entry.getKey()+ "->" +entry.getValue());
	
}

	}

}
