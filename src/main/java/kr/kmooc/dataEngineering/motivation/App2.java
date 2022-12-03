package kr.kmooc.dataEngineering.motivation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/ahnsugyeong/desktop/2022-2/데이터엔지니어링/email.txt"));
		int lineCount = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			lineCount++;

			if (line.startsWith("#"))
				continue;
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
		}
		System.out.println("줄 수: " + lineCount);
		br.close();
	}
}
