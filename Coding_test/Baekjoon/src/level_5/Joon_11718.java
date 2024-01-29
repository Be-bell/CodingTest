package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_11718 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		
		while(true) {
			if((s=bf.readLine()) != null) {
				bw.write(s + "\n");
			} else {
				bw.flush();
				break;
			}
		}
		
		bw.close();

	}

}
