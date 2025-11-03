package pekan6_2511532016;
import java.util.Random;

public class LemparDadu_2511532016 {

	public static void main(String[] args) {
		Random rand = new Random();
		int tries = 0;
		int sum = 0;
		while (sum != 24) {
			
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			int dadu3 = rand.nextInt(6) + 1;
			int dadu4 = rand.nextInt(6) + 1;
			sum = dadu1 + dadu2 + dadu3 + dadu4;
			
			System.out.println(dadu1 + " + " + dadu2 + " + " + dadu3 + " + " + dadu4 +" = " + sum);
			tries++;
		}
		System.out.println("Anda menang setelah " + tries + " kali percobaan!");
	}

}
