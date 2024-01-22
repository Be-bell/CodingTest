package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		
		StringTokenizer st1 = new StringTokenizer(s);
		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());
		
		String seq = bf.readLine();
		StringTokenizer st2 = new StringTokenizer(seq);
		
		for(int i=0; i<N; i++) {
			int A = Integer.parseInt(st2.nextToken());
			if(A < X) bw.write(A + " ");
		}
		
		bw.flush();
		bw.close();

	}

}
