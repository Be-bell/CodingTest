package level_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_10798 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] st = new String[5];
		int length = 0;
		
		for(int i=0; i<5; i++) {
			st[i] = bf.readLine();
			if(st[i].length()>length) length=st[i].length();
		}
		
		char[][] arr = new char[length][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<st[i].length(); j++) {
				arr[j][i] = st[i].charAt(j);
			}
		}
		
		String str = "";
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<5; j++) {
				StringBuilder sb = new StringBuilder(str);
				if(arr[i][j]!=0) {
					sb.append(arr[i][j]);
					str = sb.toString();
				}
			}
		}
		
		bw.write(str + "\n");
		bw.flush();
		bw.close();

	}

}
