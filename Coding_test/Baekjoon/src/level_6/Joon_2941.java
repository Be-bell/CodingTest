package level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		
		s = s.replace("c=", "?");
		s = s.replace("c-", "?");
		s = s.replace("dz=", "?");
		s = s.replace("d-", "?");
		s = s.replace("lj", "?");
		s = s.replace("nj", "?");
		s = s.replace("s=", "?");
		s = s.replace("z=", "?");
		
		bw.write(s.length() + "\n");
		bw.flush();
		bw.close();
	}

}
