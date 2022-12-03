package kr.kmooc.dataEngineering.arraylist;

import java.util.Iterator;
import java.util.List;

import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class ArrayListExample12 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> list = new MyArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		for (Integer val : list) {
			System.out.println(val);
		}

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
