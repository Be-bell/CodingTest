package level_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon_25206 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double credit_sum = 0;
		double grade_sum = 0;
		
		for(int i=0; i<20; i++) {
			String[] s = bf.readLine().split(" ");
			double credit = Double.parseDouble(s[1]);
			switch(s[2]) {
				case "A+" :
					credit_sum += credit;
					grade_sum += credit*4.5;
					break;
				case "A0" :
					credit_sum += credit;
					grade_sum += credit*4.0;
					break;
				case "B+" :
					credit_sum += credit;
					grade_sum += credit*3.5;
					break;
				case "B0" :
					credit_sum += credit;
					grade_sum += credit*3.0;
					break;
				case "C+" :
					credit_sum += credit;
					grade_sum += credit*2.5;
					break;
				case "C0" :
					credit_sum += credit;
					grade_sum += credit*2.0;
					break;
				case "D+" :
					credit_sum += credit;
					grade_sum += credit*1.5;
					break;
				case "D0" :
					credit_sum += credit;
					grade_sum += credit*1.0;
					break;
				case "F" :
					credit_sum += credit;
					grade_sum += 0;
					break;
				case "P" :
					break;
			}
		}
		
		double grade = grade_sum / credit_sum;
		
		bw.write(grade + "\n");
		bw.flush();
		bw.close();

	}

}
