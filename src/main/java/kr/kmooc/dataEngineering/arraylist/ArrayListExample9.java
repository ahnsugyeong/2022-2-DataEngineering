package kr.kmooc.dataEngineering.arraylist;

import java.util.List;

import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class ArrayListExample9 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> l = new MyArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		l.add(1, 4);
		System.out.println(l);
		System.out.println(l.set(2, 11));
		System.out.println(l);
		l.set(10, 13);
	}

}
//[3, 5, 7, 9]
//[3, 4, 5, 7, 9]
//5
//[3, 4, 11, 7, 9]
//IndexOutOfBoundsException