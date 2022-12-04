package kr.kmooc.dataEngineering.hashmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import kr.kmooc.dataEngineering.motivation.Email;

public class HashMapExample9 {

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

		HashMap<Integer, Integer> occurrence = new HashMap<Integer, Integer>();
		for (Email email : data) {
			int from = email.getFrom();
			int to = email.getTo();

			if (occurrence.containsKey(from)) {
				occurrence.put(from, occurrence.get(from) + 1);
			} else {
				occurrence.put(from, 1);
			}

			if (occurrence.containsKey(to)) {
				occurrence.put(to, occurrence.get(to) + 1);
			} else {
				occurrence.put(to, 1);
			}
		}

		for (Entry<Integer, Integer> entry : occurrence.entrySet()) {
			System.out.println(entry);
		}

	}
}
