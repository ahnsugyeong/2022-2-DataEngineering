package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample6 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0, 3);
		l.add(1, 5);
		l.add(2, 7);
		l.add(1, 9);
		System.out.println(l);
		System.out.println(l.contains(3));
		System.out.println(l.contains(5));
		System.out.println(l.contains(6));

		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(0, 0));
		emails.add(new Email(0, 1));
		emails.add(new Email(2, 2));
		System.out.println(emails);
		System.out.println(emails.contains(new Email(0, 1)));
	}

}
