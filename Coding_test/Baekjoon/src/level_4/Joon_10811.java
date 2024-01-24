package level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon_10811 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s1 = bf.readLine();
		StringTokenizer st1 = new StringTokenizer(s1);
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		
		//N개의 숫자가 입력된 바구니 생성
		int[] basket = new int[N];
		for(int t=0; t<N; t++) basket[t] = t+1;
		
		//M번 반복
		for(int k=0; k<M; k++) {
			String s2 = bf.readLine();
			StringTokenizer st2 = new StringTokenizer(s2);
			int i = Integer.parseInt(st2.nextToken()) - 1;
			int j = Integer.parseInt(st2.nextToken()) - 1;
			
			//i와 j를 입력받아 tmp변수를 이용하여 서로의 순서를 바꿔줌.
			while(i<j) {
				int tmp = basket[i];
				basket[i] = basket[j];
				basket[j] = tmp;
				i++;
				j--;
			}
		}
		
		for(int t=0; t<N; t++) bw.write(basket[t] + " ");
		bw.flush();
		bw.close();

	}

}
