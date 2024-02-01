package level_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_5086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] s = bf.readLine().split(" ");
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);
			
			if(A==0 && B==0) break;
			else {
				if(A%B==0) bw.write("multiple");
				else if(B%A==0) bw.write("factor");
				else bw.write("neither");
				bw.write("\n");
			}
		}
		
		bw.flush();
		bw.close();

	}

}
