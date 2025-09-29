package pekan4;
import java.util.Scanner;

public class Ifelse1 {

	public static void main(String[] args) {
	double IPK;
	Scanner input = new Scanner(System.in);
	System.out.print("Input IPK Anda = ");
	IPK = input.nextDouble();
	input.close();
	
	if(IPK > 2.5) {
		System.out.println("Anda lulus sangat memuaskan dengan IPK" + IPK);
	}
	else {
		System.out.println("Anda Tidak Lulus");
	}
	}

}
