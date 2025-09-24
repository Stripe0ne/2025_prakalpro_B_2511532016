package pekan3;
import java.util.Scanner;
//Menghitung volume dari suatu bola

public class TugasPekan3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int radius;
		System.out.println("Masukkan jari-jari bola: ");
		radius = keyboard.nextInt();
		final double pi = 3.14;
		keyboard.close();
		
		
		System.out.println("Volume bola = " + 4*(pi*radius*radius*radius)/3);
		
	}
}
