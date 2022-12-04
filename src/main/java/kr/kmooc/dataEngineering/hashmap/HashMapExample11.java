package kr.kmooc.dataEngineering.hashmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

import kr.kmooc.dataEngineering.motivation.Email;

public class HashMapExample11 {

	public static List<Email> getArrayList() throws IOException {
		List<Email> data = new ArrayList<Email>();
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		int index = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data.add(0, new Email(from, to));
		}
		br.close();

		return data;
	}

	public static void main(String[] args) throws IOException {
		List<Email> data = getArrayList();

		HashMap<Integer, HashSet<Integer>> receivers = new HashMap<Integer, HashSet<Integer>>();

		for (Email email : data) {
			int from = email.getFrom();
			int to = email.getTo();
			HashSet<Integer> set = null;
			if (!receivers.containsKey(from)) {
				set = new HashSet<Integer>();
			} else {
				set = receivers.get(from);
			}
			set.add(to);
			receivers.put(from, set);
		}

		System.out.println("receivers created.");

		HashMap<Integer, HashSet<Integer>> receivers2 = new HashMap<Integer, HashSet<Integer>>();
		for (Entry<Integer, HashSet<Integer>> entry : receivers.entrySet()) {
			HashSet<Integer> receiverSet = entry.getValue();
			for (Integer receiver : receiverSet) {
				if (!receivers2.containsKey(entry.getKey())) {
					HashSet<Integer> receiverSet2 = new HashSet<Integer>();
					receiverSet2.addAll(receiverSet);
					receivers2.put(entry.getKey(), receiverSet2);
				} else {
					HashSet<Integer> receiverSet2 = receivers2.get(entry.getKey());
					receiverSet2.addAll(receiverSet);
					receivers2.put(entry.getKey(), receiverSet2);
				}
			}
		}

		for (Entry<Integer, HashSet<Integer>> entry : receivers.entrySet()) {
			System.out.println(entry);
		}

	}
}
