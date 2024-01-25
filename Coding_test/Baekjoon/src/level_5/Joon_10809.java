package level_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_10809 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] s = bf.readLine().toCharArray();
		int[] alpha= new int[26];
		
		for(int i=0; i<alpha.length; i++) alpha[i] = -1;
		
		for(int j=0; j<s.length; j++) {
			int a = s[j]-97;
			if(alpha[a]==-1) alpha[a]=j;
		}
		
		for(int i=0; i<alpha.length; i++) bw.write(alpha[i] + " ");
		bw.flush();
		bw.close();
	}

}
