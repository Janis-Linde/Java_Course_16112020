package task01;
import java.util.Scanner;


public class HelloUser {

	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name and surname: ");
		String nameSurname = scanner.nextLine();
		while (!nameSurname.contains(" ")){
			System.err.print("Please enter both - name and surname: ");
			nameSurname = scanner.nextLine();
		}
		scanner.close();
		
		//processing
		nameSurname.trim();
		int separator = nameSurname.indexOf(" ");
		String name = nameSurname.substring(0, separator);
		String nameCap = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase(); 
		String surname = nameSurname.substring(separator+1).trim().toUpperCase();
				
		//output
		System.out.println("'"+nameCap+"'");
		System.out.println("'"+surname+"'");
	}

}
