package kr.kmooc.dataEngineering.arraylist;

import java.util.List;

import kr.kmooc.dataEngineering.homework1.MyArrayList;
import kr.kmooc.dataEngineering.motivation.Email;

public class ArrayListExample10 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> l = new MyArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		System.out.println(l.remove(Integer.valueOf(5)));
		System.out.println(l.remove(Integer.valueOf(11)));
		System.out.println(l);

		List<Email> emails = new MyArrayList<Email>();
		emails.add(new Email(0, 1));
		emails.add(new Email(1, 2));
		emails.add(new Email(2, 4));
		System.out.println(emails);
		System.out.println(emails.remove(new Email(0, 1)));
		System.out.println(emails.remove(new Email(1, 3)));
		System.out.println(emails);
	}

}
//[3, 5, 7, 9]
//true
//false
//[3, 7, 9]
//[0 -> 1, 1 -> 2, 2 -> 4]
//true
//false
//[1 -> 2, 2 -> 4]