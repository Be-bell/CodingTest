package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_10807 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int count = 0;
		int[] array = new int[N];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(bf.readLine());
		
		for(int j=0; j<array.length; j++) {
			if(array[j]==v) count++;
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		
	}

}
