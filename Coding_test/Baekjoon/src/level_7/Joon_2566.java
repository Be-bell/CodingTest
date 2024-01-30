package level_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_2566 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] max_values = new int[9][2];
		
		int idx = -1;
		int jdx = -1;
		int max = -1;
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0; j<9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num>max) {
					max=num;
					max_values[i][0] = j;
					max_values[i][1] = max;
				}
			}
		}
		
		for(int k=0; k<9; k++) {
			int max_value = max_values[k][1];
			if(max_value==max) {
				idx = k+1;
				jdx = max_values[k][0]+1;
				max = max_value;
			}
		}
		
		bw.write(max + "\n" + idx + " " + jdx + "\n");
		bw.flush();
		bw.close();

	}

}
