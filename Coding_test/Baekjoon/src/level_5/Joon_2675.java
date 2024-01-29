package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_2675 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		for(int i=0; i<T; i++) {
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int R = Integer.parseInt(st.nextToken());
			String[] S = st.nextToken().split("");
			for(int j=0; j<S.length; j++) {
				bw.write(S[j].repeat(R));
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}
