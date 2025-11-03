package pekan6_2511532016;
import java.util.Scanner;

public class doWhile1_2511532016 {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	String phrase;
			do {
				System.out.print("Input Password: ");
				phrase= console.next();
			} while(!phrase.equals("abcd"));
	System.out.println("Password Benar!");
	console.close();	
	}
}
