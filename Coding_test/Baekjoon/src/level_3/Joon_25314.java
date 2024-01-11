package level_3;

import java.util.Scanner;

public class Joon_25314 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i=0; (i*4)<N; i++) System.out.print("long ");
		System.out.print("int");

	}

}
