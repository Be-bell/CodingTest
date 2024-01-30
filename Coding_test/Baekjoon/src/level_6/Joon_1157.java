package level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] count = new int[26];
		
		String s = bf.readLine().toUpperCase();
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)-65]++;
		}
		
		int max = 0;
		char ch = '?';
		
		for(int j=0; j<count.length; j++) {
			if(max==count[j]) {
				ch = '?';
			} else if(max<count[j]) {
				max = count[j];
				ch = (char) (j + 65);
			}
			
		}
		
		bw.write(ch + "\n");
		bw.flush();
		bw.close();

	}

}
