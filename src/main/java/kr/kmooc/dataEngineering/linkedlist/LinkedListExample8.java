package kr.kmooc.dataEngineering.linkedlist;

import java.util.LinkedList;

import kr.kmooc.dataEngineering.homework2_3.MyLinkedList;

public class LinkedListExample8 {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.offer(7);
		linkedList.offer(9);
	
		System.out.println(linkedList);


	}

}
