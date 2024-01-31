package level_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_2745 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		String[] N = st.nextToken().split("");
		
		int B = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i=N.length; i>0; i--) {
			try {
				int a = Integer.parseInt(N[i-1]);
				sum += a*Math.pow(B,N.length-i);
			} catch (NumberFormatException e) {
				int a = N[i-1].charAt(0) - 55;
				sum += a*Math.pow(B,N.length-i);
			} 
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}

}
