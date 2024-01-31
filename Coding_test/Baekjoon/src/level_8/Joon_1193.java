package level_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_1193 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(bf.readLine());
		int Mother = 1;
		int Son = 1;
		int count = 0;
		
		for(int i=1; i<X; i++) {
			if(count%2==1) {
				if(Mother==1) {
					Son++;
					count++;
				} else {
					Mother--;
					Son++;
				}
			} else {
				if(Son==1) {
					Mother++;
					count++;
				} else {
					Mother++;
					Son--;
				}
			}
		}
		
		bw.write(Son + "/" + Mother + "\n");
		bw.flush();
		bw.close();

	}

}
