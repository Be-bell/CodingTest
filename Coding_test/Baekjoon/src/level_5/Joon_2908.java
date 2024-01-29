package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_2908 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int[] sang = new int[2];
		
		for(int i=0; i<2; i++) {
			StringBuilder sb = new StringBuilder(st.nextToken());
			sang[i] = Integer.parseInt(sb.reverse().toString());
		}
		
		bw.write(Math.max(sang[0], sang[1]) + "\n");
		bw.flush();
		bw.close();
		
	}

}
