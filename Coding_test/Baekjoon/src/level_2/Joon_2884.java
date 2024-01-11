package level_2;

import java.util.Scanner;

public class Joon_2884 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		int hour = h;
		int minute = m - 45;
		
		if(minute<0) {
			minute += 60;
			hour -= 1;
		}
		
		if(hour<0) hour += 24;
		
		System.out.println(hour + " " + minute);
		
	}

}