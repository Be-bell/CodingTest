package level_2;

import java.util.Scanner;

public class Joon_2480 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(A==B && B==C) {
			System.out.println(10000+A*1000);
		} else {
			if(A==B || A==C) {
				System.out.println(1000+100*A);
			} else if(B==C) {
				System.out.println(1000+100*B);
			} else {
				System.out.println(Math.max(Math.max(A, B), C)*100);
			}
		}
	}
}
