package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_1152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] S = bf.readLine().split(" ");
		int Str_length = S.length;
		
		if(Str_length!=0) {
			if(S[0].equals("") || S[S.length-1].equals("")) Str_length--;
		}
		bw.write(Str_length + "\n");
		bw.flush();
		bw.close();
	}

}
