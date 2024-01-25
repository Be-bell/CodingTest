package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_9086 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<T; i++) {
			String s = bf.readLine();
			String[] s_split = s.split("");
			bw.write(s_split[0] + s_split[s.length()-1] + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
