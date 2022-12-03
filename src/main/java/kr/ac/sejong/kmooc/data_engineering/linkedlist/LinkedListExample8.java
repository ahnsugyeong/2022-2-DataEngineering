package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample8 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.offer(7);
		linkedList.offer(9);
	
		System.out.println(linkedList);


	}

}
