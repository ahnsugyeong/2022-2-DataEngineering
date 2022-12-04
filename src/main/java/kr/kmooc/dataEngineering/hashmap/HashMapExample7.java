package kr.kmooc.dataEngineering.hashmap;

import java.util.HashMap;

import kr.kmooc.dataEngineering.motivation.Email;

public class HashMapExample7 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 3);
		map.put(5, 7);
		map.put(3, 9);
		System.out.println(map);
		map.remove(3);
		System.out.println(map);
		map.remove(2);
		System.out.println(map);
	}
}
