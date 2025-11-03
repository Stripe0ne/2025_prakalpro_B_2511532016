package pekan6_2511532016;
import java.util.Scanner;

public class SentilelLoop_2511532016 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int number = 67;
		console.close();
		
		
		while(number != 0) {
			System.out.print("Masukkan angka (0 untuk keluar): ");
			number = console.nextInt();
			sum += number;
		}
		System.out.println("Totalnya adalah " + sum);
		
	}

}
