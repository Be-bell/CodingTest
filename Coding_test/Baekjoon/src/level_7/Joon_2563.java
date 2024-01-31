package level_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_2563 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		int[][] paper = new int[100][100];
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken())-1;
			int B = Integer.parseInt(st.nextToken())-1;
			
			for(int j=A; j<A+10; j++) {
				for(int k=B; k<B+10; k++) paper[j][k] = 1;
			}
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) sum += paper[i][j];
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();

	}

}
