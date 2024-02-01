package level_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Joon_2581 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(bf.readLine());
		int N = Integer.parseInt(bf.readLine());
		
		String[] prime = {};
		List<String> arr = new ArrayList<String>(Arrays.asList(prime));
		
		int sum = 0;
		
		for(int i=M; i<=N; i++) {
			boolean is_prime = (i==1 ? false: true);
			
			for(int j=1; j<i; j++) {
				if(j!=1 && i%j==0) {
					is_prime = false;
					break;
				}
			}
			
			if(is_prime) {
				arr.add(String.valueOf(i));
				sum+=i;
			}
		}
		
		prime = arr.toArray(prime);
		if(prime.length==0) bw.write("-1");
		else bw.write(sum + "\n" + prime[0] + "\n");
		
		bw.flush();
		bw.close();
	}

}
