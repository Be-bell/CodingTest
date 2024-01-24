package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_3052 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] remain = new int[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			int A = Integer.parseInt(bf.readLine());
			remain[A%42] += 1;
		}
		
		for(int j:remain) {
			if(j!=0) count++;
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();

	}

}
