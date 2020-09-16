package week07;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

	public static boolean isArmstrong(int number) {
		int checkNumber = number;
		int sum = 0;
		while (number >= 1) {
			int digit = number % 10;
			sum += (int) (Math.pow(digit, 3));
			number /= 10;
		}
		return sum == checkNumber;
	}
}
