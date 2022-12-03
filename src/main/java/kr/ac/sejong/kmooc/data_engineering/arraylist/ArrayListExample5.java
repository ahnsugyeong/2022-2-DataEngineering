package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

public class ArrayListExample5 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0, 3);
		System.out.println(l);
		// l.add(2, 5); -> index out of bounds

		l.add(1, 5);
		System.out.println(l);
		l.add(2, 7);
		System.out.println(l);

		l.add(1, 9);
		System.out.println(l);
	}

}
