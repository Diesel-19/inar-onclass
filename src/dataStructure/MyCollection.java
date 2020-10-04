package dataStructure;

import java.util.ArrayList;

public class MyCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Munich");
		list.add("Berlin");
		list.add("Seattle");
		list.add(2, "London");

		ArrayList<String> copyList = new ArrayList<>();

		System.out.println("This is copyList" + copyList);

		System.out.println(list.toString());
		copyList = (ArrayList<String>) list.clone();
	}
}
