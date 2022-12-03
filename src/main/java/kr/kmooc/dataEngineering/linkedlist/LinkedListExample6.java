package kr.kmooc.dataEngineering.linkedlist;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.kmooc.dataEngineering.homework2_3.MyLinkedList;

public class LinkedListExample6 {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(9);
		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for (Integer val : linkedList) {
			System.out.println(val);
		}

		ListIterator<Integer> listIterator = linkedList.listIterator(3);
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
