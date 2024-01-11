package level_2;

import java.util.Scanner;

public class Joon_2525 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int h = A;
		int m = B+C;
		
		if(m>=60) {
			int hour = m/60;
			m %= 60;
			h += hour;
		}
		
		if(h>=24) h-=24;
		System.out.println(h + " " + m);

	}

}
