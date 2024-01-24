package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int[] grade = new int[N];
		int sum=0;
		
		for(int i=0; i<N; i++) {
			grade[i] = Integer.parseInt(st.nextToken());
			sum += grade[i];
		}
		
		int max=grade[0];
		if(N>1) for(int j=1; j<N-1; j++) max=Math.max(grade[j], max);
		
		double mean = 0.0;
		if(max!=0) mean = (double) (sum*100)/(N*max);
		
		bw.write(mean + "\n");
		bw.flush();
		bw.close();
		
	}

}