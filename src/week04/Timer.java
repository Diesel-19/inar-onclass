package week04;

import java.util.Scanner;

public class Timer {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a time period: ");
		int time = input.nextInt();
		int totalSecond = time * 60;
		for (int i = totalSecond; i > 0; i--) {
			int minute = i / 60;
			int second = i % 60;
			String s = "";
			s = (second > 9) ? ("" + second) : ("0" + second);
			System.out.printf("%2d:%s\n", minute, s);
			Thread.sleep(1000);
		}
	}
}
