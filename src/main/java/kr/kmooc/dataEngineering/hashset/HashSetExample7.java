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

public class HashSetExample7 {

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

	public static void main(String[] args) throws IOException {

		Set<Integer> senderSet = getHashSetSenderIDs();
		Set<Integer> receiverSet = getHashSetReceiverIDs();

		System.out.println("보낸 사람 수: "+senderSet.size());
		System.out.println("받는 사람 수: "+receiverSet.size());
		
//		senderSet.addAll(receiverSet);
//		System.out.println("이메일 네트워크에 참여한 사람 수: "+senderSet.size());
		
//		senderSet.retainAll(receiverSet);
//		System.out.println("이메일을 보내고 받은 사람 수: "+senderSet.size());
		
//		senderSet.removeAll(receiverSet);
//		System.out.println("이메일 보내기만 한 사람 수: "+senderSet.size());
		
		receiverSet.removeAll(senderSet);
		System.out.println("이메일 받기만 한 사람 수: "+receiverSet.size());
		
	}
}
