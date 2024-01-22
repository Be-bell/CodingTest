package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int max = Integer.parseInt(st.nextToken());;
		int min = max;
		
		for(int i=1; i<N; i++) {
			int A = Integer.parseInt(st.nextToken());
			max = (max < A ? A : max);
			min = (min > A ? A : min);
		}
		
		bw.write(min + " " + max + "\n");
		bw.flush();
		bw.close();

	}

}
