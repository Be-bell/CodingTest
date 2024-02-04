package level_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_27323 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		
		bw.write(A*B + "\n");
		bw.flush();
		bw.close();
		
	}

}
