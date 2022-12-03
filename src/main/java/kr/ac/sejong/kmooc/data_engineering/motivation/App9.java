package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App9 {

	public static Email[] getData() throws IOException {
		Email[] data = new Email[420045];
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
			data[index++] = new Email(from, to);
		}
		br.close();

		return data;
	}

	public static void main(String args[]) throws IOException {
		Email[] data = getData();

		// 보낸 사람 Integer[] senders

		Integer[] senders = new Integer[300000];
		for (Email email : data) {
			int from = email.from;
			for (int i = 0; i < senders.length; i++) {
				if (senders[i] == null) {
					senders[i] = from;
					break;
				}
				// 중복 제거
				if (senders[i] == from)
					break;
			}
		}

		int senderCount = 0;
		for (int i = 0; i < senders.length; i++) {
			if (senders[i] == null)
				break;
			senderCount++;
		}
		// 보낸 사람의 수: 225409
		System.out.println("보낸 사람의 수: " + senderCount);

	}
}