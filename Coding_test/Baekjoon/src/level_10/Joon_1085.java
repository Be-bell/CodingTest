package level_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_1085 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = bf.readLine().split(" ");
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);
		int w = Integer.parseInt(s[2]);
		int h = Integer.parseInt(s[3]);
		
		int min = Math.min(Math.min(x, w-x), Math.min(y, h-y));
		
		bw.write(min + "\n");
		bw.flush();
		bw.close();
		
	}

}
