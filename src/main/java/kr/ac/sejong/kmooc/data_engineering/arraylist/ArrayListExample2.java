package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());

		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());

		ArrayList<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
	}

}
