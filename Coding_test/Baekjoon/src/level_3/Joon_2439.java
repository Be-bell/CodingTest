package level_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_2439 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<N; j++) {
				if(N-j<=i) { bw.write("*"); }
				else { bw.write(" "); }
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
