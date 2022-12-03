package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample12 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Integer val : list) {
			System.out.println(val);
		}

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
