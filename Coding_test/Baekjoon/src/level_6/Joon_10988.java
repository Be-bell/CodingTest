package level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_10988 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		StringBuilder sb = new StringBuilder(s);
		
		if(sb.reverse().toString().equals(s)) bw.write("1");
		else bw.write("0");
		
		bw.flush();
		bw.close();
	}

}
