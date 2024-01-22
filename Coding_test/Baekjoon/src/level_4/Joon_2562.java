package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int[] array = new int[9];
		
		for(int i=0; i<9; i++) {
			int N = Integer.parseInt(bf.readLine());
			array[i] = N;
			max = (N>max ? N : max);
		}
		
		bw.write(max + "\n");
		
		for(int j=0; j<array.length; j++) {
			if(array[j] == max) {
				bw.write( (j+1) + "\n");
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}
}
