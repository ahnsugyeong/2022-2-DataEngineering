package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample14 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		ListIterator<Integer> listIterator2 = list.listIterator(list.size());
		while (listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}

	}

}
