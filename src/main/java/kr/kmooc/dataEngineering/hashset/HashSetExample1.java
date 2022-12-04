package kr.kmooc.dataEngineering.hashset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		Collection<Integer> intHashSet = new HashSet<Integer>();
		System.out.println(intHashSet);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(5);
		System.out.println(arrayList);

		HashSet<Integer> intHashSet2 = new HashSet<Integer>(arrayList);
		System.out.println(intHashSet2);

	}

}
