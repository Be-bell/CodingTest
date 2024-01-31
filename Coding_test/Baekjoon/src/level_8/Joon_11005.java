package level_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_11005 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = bf.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		
		String num = "";
		
		StringBuilder sb = new StringBuilder(num);
		while(N/B>0) {
			if(N%B>9) {
				char alphabet = (char) ( N%B - 10 + 'A');
				sb.append(alphabet);
			} else {
				sb.append(N%B);
			}
			N = N/B;
		}
		
		if(N%B>9) {
			char alphabet = (char) ( N%B - 10 + 'A');
			sb.append(alphabet);
		} else {
			sb.append(N%B);
		}
		
		num = sb.reverse().toString();
		
		bw.write(num + "\n");
		bw.flush();
		bw.close();
	}

}
