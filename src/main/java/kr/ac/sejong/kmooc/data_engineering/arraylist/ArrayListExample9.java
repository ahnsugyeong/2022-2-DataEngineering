package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

public class ArrayListExample9 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		l.add(1, 4);
		System.out.println(l);
		l.set(2, 11);
		System.out.println(l);

	}

}
