package level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_2444 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		for(int i=1; i<2*N; i++) {
			if(i<=N) {
				for(int j=0; j<N-i; j++) bw.write(" ");
				for(int k=0; k<2*i-1; k++) bw.write("*");
			} else {
				for(int j=i; j>N; j--) bw.write(" ");
				for(int k=4*N; k>2*i+1; k--) bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}
