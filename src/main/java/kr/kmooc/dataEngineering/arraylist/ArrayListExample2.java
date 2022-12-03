package kr.kmooc.dataEngineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.kmooc.dataEngineering.homework1.MyArrayList;
import kr.kmooc.dataEngineering.motivation.Email;

public class ArrayListExample2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());

		List<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());

		List<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
		
		List<Integer> intList2 = new MyArrayList<Integer>();
		System.out.println(intList2.isEmpty());

		List<String> stringList2 = new MyArrayList<String>();
		System.out.println(stringList2.isEmpty());

		List<Email> emailList2 = new MyArrayList<Email>();
		System.out.println(emailList2.isEmpty());
	}

}
