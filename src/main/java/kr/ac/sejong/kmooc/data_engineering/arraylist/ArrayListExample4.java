package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

public class ArrayListExample4 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());

		System.out.println(intList.add(3));
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());

		System.out.println(intList.add(7));
		System.out.println(intList.add(5));
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
	}

}
