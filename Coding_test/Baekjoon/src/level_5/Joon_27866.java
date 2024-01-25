package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_27866 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = bf.readLine();
		String[] s_split = S.split("");
		
		int i = Integer.parseInt(bf.readLine());
		bw.write(s_split[i-1]);
		bw.flush();
		bw.close();
	}

}
