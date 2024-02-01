package level_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Joon_9506 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			String[] factor = {};
			List<String> arr = new ArrayList<>(Arrays.asList(factor));
			int sum = 0;
			
			int n = Integer.parseInt(bf.readLine());
			if(n==-1) break;
			
			for(int i=1; i<n; i++) {
				if(n%i==0) {
					arr.add(String.valueOf(i));
					sum += i;
				}
			}
			
			factor = arr.toArray(factor);
			
			if(sum != n) {
				bw.write(n + " is NOT perfect.");
			} else {
				bw.write(n + " = ");
				for(int j=0; j<factor.length-1; j++) {
					bw.write(factor[j] + " + ");
				}
				bw.write(factor[factor.length-1]);
			}
			bw.write("\n");	
		}
		
		bw.flush();
		bw.close();

	}

}
