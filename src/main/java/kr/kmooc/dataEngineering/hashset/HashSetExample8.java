package kr.kmooc.dataEngineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import kr.kmooc.dataEngineering.motivation.Email;

public class HashSetExample8 {

	public static Set<Integer> getHashSetID() throws IOException {
		Set<Integer> data = new HashSet<Integer>();
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
			data.add(from);
			data.add(to);
		}
		br.close();

		return data;
	}

	public static Set<Integer> getHashSetSenderIDs() throws IOException {
		Set<Integer> data = new HashSet<Integer>();
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
			data.add(from);
		}
		br.close();

		return data;
	}

	public static Set<Integer> getHashSetReceiverIDs() throws IOException {
		Set<Integer> data = new HashSet<Integer>();
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
			data.add(to);
		}
		br.close();

		return data;
	}

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

		ArrayList<HashSet<Integer>> receivers = new ArrayList<HashSet<Integer>>();
		for (int i = 0; i < 265214; i++) {
			receivers.add(new HashSet<Integer>());
		}

		HashSet<Occurrence> occSet = new HashSet<Occurrence>();
		for (Email email : data) {
			int from = email.getFrom();
			int to = email.getTo();

			HashSet<Integer> current = receivers.get(from);
			current.add(to);
			receivers.set(from, current);
		}

		for (int i = 0; i < receivers.size(); i++) {
			System.out.println(i + " : " + receivers.get(i));
		}
	}
}
