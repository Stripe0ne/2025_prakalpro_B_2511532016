package pekan7_2511532016;
import java.util.Scanner;
public class tugasAlproPekan7_2511532016 {
//Cihuyyy first-time ngoding tanpa campur tangan AI. Pat myself on the back for that :D
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Akun Registrasi = new Akun();
	
	//BAGIAN TERIMA INPUT
	System.out.println("==== REGISTRASI AKUN BARU ====");
	System.out.print("Masukkan Username: ");
	String username = input.nextLine(); 
	System.out.print("Masukkan Password: ");
	String password = input.nextLine();
	System.out.print("Masukkan Email: ");
	String email = input.nextLine();
	System.out.print("Masukkan PIN (6 digit): ");
	int pinAngka = input.nextInt();

	input.close();	
	
	Registrasi.setEmail(email);
	Registrasi.setPassword(password);
	Registrasi.setUsername(username);
	Registrasi.setPin(pinAngka);
	
	//BAGIAN HASIL KELUARAN
	if(!(Registrasi.isEmailValid(email))) {
		System.out.println ("Email Anda\" " + email + "\" tidak valid (harus mengandung '@' dan '.').");
		System.out.println("Silahkan coba lagi.");
	}
	
	else if(!(Registrasi.isPasswordValid(password))) {
		System.out.println("Password Anda\" " +  password + "\" tidak valid (harus terdiri dari 8 karakter atau lebih).");
		System.out.println("Silahkan coba lagi.");
	}
	else{
		System.out.println();
		System.out.println("--- REGISTRASI BERHASIL ---");
		System.out.println("Akun untuk \"" + username + "\" telah berhasil dibuat.");
		System.out.println();
		
		System.out.println("--- DETAIL AKUN ---");
		System.out.printf("%-25s: %s %s\n", "Username (Lowercase) ", username.toLowerCase(), "");
		System.out.printf("%-25s: %s %s\n", "Email (Uppercase) " , email.toUpperCase(), "");
		System.out.printf("%-25s: %s %s\n", "ID Pengguna (Gabungan) " , username + pinAngka, "");
		
		System.out.println();
		System.out.println("--- Uji Tipe Data (PIN Anda " + pinAngka + ") ---");
		System.out.printf("%-25s= %s %s\n" , "PIN (int) + 10 " , (pinAngka + 10), "");
		System.out.printf("%-25s= %s %s\n", "PIN (String) + \"10\"" , pinAngka+ "10", "");
		
	}

	}
	} 