package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

public class ArrayListExample7 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0, 3);
		l.add(1, 5);
		l.add(2, 7);
		l.add(1, 9);
		System.out.println(l);

		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		// System.out.println(l.get(4));
	}

}
