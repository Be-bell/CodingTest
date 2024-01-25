package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_11720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		String[] s_split = s.split("");
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(s_split[i]);
			sum += num;
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}

}
