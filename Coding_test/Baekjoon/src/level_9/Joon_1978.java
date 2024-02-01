package level_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_1978 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		String[] s = bf.readLine().split(" ");
		int count = 0;
		
		for(int i=0; i<N; i++) {
			
			int num = Integer.parseInt(s[i]);
			boolean is_prime = (num==1 ? false: true);
			
			for(int k=1; k<=num; k++) {
				if(k!=1 && k!=num && num%k==0) {
					is_prime = false;
					break;
				}
			}
			
			if(is_prime) count++;
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();

	}

}
