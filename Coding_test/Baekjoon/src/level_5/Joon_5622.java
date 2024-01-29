package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_5622 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = bf.readLine();
		
		int[] dial = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		int sec=0;
		
		for(int i=0; i<str.length(); i++) {
			sec += dial[str.charAt(i)-65];
		}
		
		bw.write(sec + "\n");
		bw.flush();
		bw.close();
		
	}

}
