package pekan6_2511532016;
import java.util.Scanner;

public class perulanganWhile1_2511532016 {

	public static void main(String[] args) {
	
	int counter=0;
	String jawab;
	boolean running = true;
	
	Scanner scan = new Scanner (System.in);
	while(running) {
		counter++;
		System.out.println("Jumlah = " + counter);
		System.out.print("Apakah lanjut? (Yes/No)");
		jawab = scan.nextLine();
		if(jawab.equalsIgnoreCase("no")) running = false;  
	}
	scan.close();
	
	
System.out.print("Anda sudah melakukan perulangan sebanyak " +counter+ " kali");
	}

}
