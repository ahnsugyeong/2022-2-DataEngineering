package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

public class ArrayListExample11 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		System.out.println(l.remove(0));
		System.out.println(l);
		l.add(11);
		System.out.println(l);
		System.out.println(l.remove(1));
		System.out.println(l);
	}

}
