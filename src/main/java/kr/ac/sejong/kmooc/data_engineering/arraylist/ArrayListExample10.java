package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample10 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		System.out.println(l.remove(Integer.valueOf(5)));
		System.out.println(l.remove(Integer.valueOf(11)));
		System.out.println(l);

		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(0, 1));
		emails.add(new Email(1, 2));
		emails.add(new Email(2, 4));
		System.out.println(emails);
		System.out.println(emails.remove(new Email(0, 1)));
		System.out.println(emails.remove(new Email(1, 3)));
		System.out.println(emails);
	}

}
