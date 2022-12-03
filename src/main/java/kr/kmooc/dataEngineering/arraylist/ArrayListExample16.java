package kr.kmooc.dataEngineering.arraylist;

import java.util.List;

import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class ArrayListExample16 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);
		Object[] array = new Object[3];
		array = list.toArray(array); // 더 작은 크기면 새로운 크기의 array 생성, 더 큰 크기면 남은 부분 null
		for (Object val : array) {
			System.out.println(val);
		}

	}

}
