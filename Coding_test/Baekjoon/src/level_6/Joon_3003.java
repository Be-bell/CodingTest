package level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_3003 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		for(int i=0; i<chess.length; i++) {
			bw.write(chess[i] - Integer.parseInt(st.nextToken()) + " ");
		}
		
		bw.flush();
		bw.close();

	}

}
