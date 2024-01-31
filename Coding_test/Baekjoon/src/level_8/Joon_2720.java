package level_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_2720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<T; i++) {
			int money = Integer.parseInt(bf.readLine());
			int Quarter = money/25;
			int Dime = (money%25)/10;
			int Nickel = (money%25%10)/5;
			int Penny = money%25%10%5;
			
			bw.write(Quarter + " " + Dime + " " + Nickel + " " + Penny + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
