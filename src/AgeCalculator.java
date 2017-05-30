import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {

		int day = 0;
		String month;
		int year = 0;
		String repeat = "y";
		Scanner keyboard = new Scanner(System.in);
		int[] arr = new int[50];
		int i = 0;
		int age;

		while (repeat.equals("y")) {

			System.out.println("Please enter in a day");
			day = keyboard.nextInt();

			System.out.println("Please enter in a month");
			month = keyboard.next();

			System.out.println("Please enter in a year");
			year = keyboard.nextInt();
			repeat = "error";
			do {
				if (!repeat.equals("y") && !repeat.equals("n") && !repeat.equals("error")) {
					System.out.println("~~~~~~~~~~~~Please enter y/n~~~~~~~~~~~~");
				}
				System.out.println("Would you like to enter another client?");
				repeat = keyboard.next();
			} while (!repeat.equals("y") && !repeat.equals("n"));
			age = 2017 - year;
			arr[i] = age;
			i++;

		}
		System.out.println("Thanks for using the age calculator!");
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 0) {
				System.out.print(arr[j] + " ");
			}

		}

	}
}
