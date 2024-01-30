package level_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_2738 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s1 = bf.readLine();
		StringTokenizer st1 = new StringTokenizer(s1);
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		
		int[][] C = new int[N][M];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			for(int j=0; j<M; j++) C[i][j] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			for(int j=0; j<M; j++) {
				C[i][j] += Integer.parseInt(st2.nextToken());
				bw.write(C[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}
