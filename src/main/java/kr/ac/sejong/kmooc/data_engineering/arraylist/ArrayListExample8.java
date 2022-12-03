package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample8 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(7);

		System.out.println(l);
		System.out.println(l.indexOf(3));
		System.out.println(l.lastIndexOf(3));
		System.out.println(l.indexOf(5));
		System.out.println(l.lastIndexOf(5));

		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(0, 1));
		emails.add(new Email(1, 2));
		emails.add(new Email(1, 2));
		emails.add(new Email(2, 3));

		System.out.println(emails);
		System.out.println(emails.indexOf(new Email(1, 2)));
		System.out.println(emails.lastIndexOf(new Email(1, 2)));

	}

}
