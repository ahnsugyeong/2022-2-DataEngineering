package kr.kmooc.dataEngineering.hashmap;

import java.util.HashMap;

import kr.kmooc.dataEngineering.motivation.Email;

public class HashMapExample6 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 3);
		map.put(5, 7);
		map.put(3, 9);
		System.out.println(map);
		System.out.println(map.containsKey(5));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue(3));
		System.out.println(map.containsValue(4));
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.getOrDefault(2, 3));

		System.out.println(map);
	}
}
