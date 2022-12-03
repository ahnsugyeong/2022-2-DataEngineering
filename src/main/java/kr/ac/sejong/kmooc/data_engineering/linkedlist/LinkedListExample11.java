package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class LinkedListExample11 {

	public static List<Email> getData() throws IOException {
		List<Email> data = new LinkedList<Email>();
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		int index = 0;
		int count = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data.add(new Email(from, to));
			System.out.println(++count);
		}
		br.close();

		return data;
	}

	public static void main(String[] args) throws IOException {
		List<Email> data = getData();
		// 이벤트의 수
		// 최소 사람의 ID
		// 최대 사람의 ID

		int count = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (Email email : data) {
			int from = email.getFrom();
			int to = email.getTo();
			count++;

			if (from < min)
				min = from;
			if (from > max)
				max = from;
			if (to < min)
				min = to;
			if (to > max)
				max = to;
		}
		System.out.println("이벤트의 수: " + count);
		System.out.println("최소 사람 ID: " + min);
		System.out.println("최대 사람 ID: " + max);

	}
}
