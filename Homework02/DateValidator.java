package task02;
import java.util.Scanner;


public class DateValidator {

	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a year, a date and a month as numbers in separate lines: ");
		int year = scanner.nextInt();
		int date = scanner.nextInt();
		int month = scanner.nextInt();
		
		//processing
		int dateLimit = 31;
		if (month == 4 || month == 6 || month == 9 || month == 11){
			dateLimit = 30;
		} else if (month == 2 && year % 4 == 0){
			dateLimit = 29;
		} else if (month == 2 && year % 4 != 0){
			dateLimit = 28;
		}
		
		while (month < 1 || month > 12){
			System.out.println("Please enter a valid month: ");
			month = scanner.nextInt();
		}
		while (date < 1 || date > dateLimit){
			System.out.println("Please enter a valid date: ");
			date = scanner.nextInt();
		}
		scanner.close();

		String[] months = {"janvāris", "februāris", "marts", "aprīlis", "maijs", "jūnijs", "jūlijs", "augusts", "septembris", "oktobris", "novembris", "decembris"};
		
		//output
		System.out.println(year+". gada  "+ date +".  "+ months[month-1]);
	}

}
