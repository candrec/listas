package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Ana");
		list.add("Alex");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("---------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------------");
		System.out.println("index of Bob: "+ list.indexOf("Bob"));
		System.out.println("index of André: "+list.indexOf("André"));
		System.out.println("-----------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x:result) {
			System.out.println(x);
		}
		System.out.println("------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
