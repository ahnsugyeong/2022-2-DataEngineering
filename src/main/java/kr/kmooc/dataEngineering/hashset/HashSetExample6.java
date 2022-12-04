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

public class HashSetExample6 {

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

	public static List<Integer> getLinkedListID() throws IOException {
		List<Integer> data = new LinkedList<Integer>();
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

			if (!data.contains(from))
				data.add(from);
			if (!data.contains(to))
				data.add(to);
		}
		br.close();

		return data;
	}

	public static List<Integer> getArrayListID() throws IOException {
		List<Integer> data = new ArrayList<Integer>();
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

			if (!data.contains(from))
				data.add(from);
			if (!data.contains(to))
				data.add(to);
		}
		br.close();

		return data;
	}

	public static void main(String[] args) throws IOException {
		Set<Integer> idSet = getHashSetID();
		Set<Integer> senderSet = getHashSetSenderIDs();
		ArrayList<Integer> senderArrayList = new ArrayList<Integer>(senderSet);
		LinkedList<Integer> senderLinkedList = new LinkedList<Integer>(senderSet);

		long p1 = System.currentTimeMillis();
		for (Integer id : idSet) {
			senderSet.contains(id);
		}
		System.out.println("HashSet: " + (System.currentTimeMillis() - p1));

		long p2 = System.currentTimeMillis();
		for (Integer id : idSet) {
			senderArrayList.contains(id);
		}
		System.out.println("ArrayList: " + (System.currentTimeMillis() - p2));

		long p3 = System.currentTimeMillis();
		for (Integer id : idSet) {
			senderLinkedList.contains(id);
		}
		System.out.println("LinkedList: " + (System.currentTimeMillis() - p3));

	}
}
