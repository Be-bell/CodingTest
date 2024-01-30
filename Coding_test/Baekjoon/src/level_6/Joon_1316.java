package level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_1316 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int count = 0;
		for(int i=0; i<N; i++) {
			String s = bf.readLine();
			int[] arr = new int[26];
			for(int j=0; j<s.length(); j++) {
				if(j!=0 && s.charAt(j)!=s.charAt(j-1) && arr[s.charAt(j)-97]!=0) break;
				arr[s.charAt(j)-97]++;
				if(j+1==s.length()) count++;
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();

	}

}
