package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		while (true) {
			String line = br.readLine();
			if (line == null) break;
			if(line.startsWith("#")) continue;
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			
			System.out.println(new Email(from, to));
			
		}
		br.close();
	}
}
// Ctrl + Shift + F -> 자동 포맷