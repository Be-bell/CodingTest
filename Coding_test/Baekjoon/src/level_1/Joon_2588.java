package level_1;

import java.util.Scanner;

public class Joon_2588 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int value = 0;
		int result = 0;
		
		for(int i=0; i<3; i++) {
			value = A*(B%10);
			System.out.println(value);
			result += value * Math.pow(10, i);
			B /= 10;
		}
		System.out.println(result);

	}

}
