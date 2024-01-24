package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_10813 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s1 = bf.readLine();
		StringTokenizer st1 = new StringTokenizer(s1);
		
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());

		int[] basket = new int[N];
		for(int t=0; t<N; t++) {
			basket[t] = t+1;
		}
		
		for(int k=0; k<M; k++) {
			String s2 = bf.readLine();
			StringTokenizer st2 = new StringTokenizer(s2);
			int i = Integer.parseInt(st2.nextToken()) - 1;
			int j = Integer.parseInt(st2.nextToken()) - 1;
			if(i!=j) {
				int tmp = basket[i];
				basket[i] = basket[j];
				basket[j] = tmp;
			}
		}
		
		for(int t=0; t<N; t++) {
			bw.write(basket[t] + " ");
		}
		
		bw.flush();
		bw.close();
	}

}
