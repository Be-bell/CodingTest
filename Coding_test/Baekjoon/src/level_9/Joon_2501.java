package level_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_2501 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = bf.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		
		int factor = 0;
		int count = 0;
		
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				factor = i;
				count++;
			}
			if(count==K) {
				bw.write(factor + "\n");
				break;
			}
		}
		if(count<K) bw.write(0 + "\n");
		bw.flush();
		bw.close();
	}

}
