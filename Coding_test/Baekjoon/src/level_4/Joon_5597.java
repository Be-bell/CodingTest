package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_5597 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] attend = new int[30];
		
		for(int i=0; i<28; i++) {
			int attend_num = Integer.parseInt(bf.readLine()) - 1;
			attend[attend_num] = 1;
		}
		
		for(int j=0; j<30; j++) {
			if(attend[j]!=1) bw.write( (j+1) + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
