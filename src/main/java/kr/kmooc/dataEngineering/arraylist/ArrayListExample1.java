package kr.kmooc.dataEngineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.kmooc.dataEngineering.homework1.MyArrayList;
import kr.kmooc.dataEngineering.motivation.Email;

public class ArrayListExample1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		List<String> stringList = new ArrayList<String>();
		List<Email> emailList = new ArrayList<Email>();
		
		List<Integer> intList2 = new MyArrayList<Integer>();
		List<String> stringList2 = new MyArrayList<String>();
		List<Email> emailList2 = new MyArrayList<Email>();
		
	}

}
