package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App8 {

	public static Email[] getData() throws IOException{
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
		
		// 265213 
		for (Email email : data) {
			if(email.from == 265213) {
				System.out.println("발견");
				System.exit(1);
			}
			if(email.to == 265213) {
				System.out.println("발견");
				System.exit(1);
			}
		}
		System.out.println("미발견");

	}
}