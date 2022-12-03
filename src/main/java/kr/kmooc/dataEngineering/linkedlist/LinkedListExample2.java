package kr.kmooc.dataEngineering.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

import kr.kmooc.dataEngineering.homework2_3.MyLinkedList;
import kr.kmooc.dataEngineering.motivation.Email;

public class LinkedListExample2 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(5);

		LinkedList<Integer> intList = new LinkedList<Integer>(arrayList);
		LinkedList<String> stringList = new LinkedList<String>();
		LinkedList<Email> emailList = new LinkedList<Email>();

		System.out.println(intList);
		System.out.println(stringList);
		System.out.println(emailList);

		MyLinkedList<Integer> intList2 = new MyLinkedList<Integer>(arrayList);
		System.out.println(intList2);
	}

}
