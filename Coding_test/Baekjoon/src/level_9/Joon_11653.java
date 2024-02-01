package level_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_11653 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		while(N>1) {
			int a=1;
			for(int i=2; i<=N; i++) {
				if(N%i==0) {
					a=i;
					break;
				}
			}
			bw.write(a + "\n");
			N = N/a;
		}
		
		bw.flush();
		bw.close();

	}

}
