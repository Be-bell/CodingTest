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
		double [] grade = new double[N];
		
		for(int i=0; i<N; i++) {
			grade[i] = Integer.parseInt(st.nextToken());
		}
		
		double max=grade[0];
		if(N>1) for(int j=1; j<N; j++) max=Math.max(grade[j], max);
		
		double sum = 0.0;
		for(int i=0; i<N; i++) {
			grade[i] = (double) (grade[i]*100)/max;
			sum += grade[i];
		}
		
		double mean = (double) sum / N;
		
		bw.write(mean + "\n");
		bw.flush();
		bw.close();
		
	}

}