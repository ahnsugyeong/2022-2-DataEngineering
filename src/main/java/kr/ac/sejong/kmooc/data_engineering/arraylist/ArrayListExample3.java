package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());

		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());
		System.out.println(stringList.size());

		ArrayList<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
		System.out.println(emailList.size());
	}

}
