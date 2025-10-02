package pekan4;
import java.util.Scanner;

public class tugasAlproPekan4_2511532016 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nama pembeli: ");
		String nama= input.nextLine();
		System.out.print("Masukkan banyak tiket yang ingin dibeli: ");
		int jumlahTiket= input.nextInt();
		System.out.print("(1)Senin-Kamis (2)Jumat (3)Sabtu-Minggu\nMasukkan hari penayangan (angka): ");
		int input_hari = input.nextInt();
		System.out.println(); //Sebenarnya nggak perlu baris baru, biar rapi ae inimah
		System.out.print("(1)Pagi 10:10-12:00 (2)Siang 12:00-17:00 (3)Malam 17:00-22:00\nMasukkan waktu penayangan (angka): ");
		int input_waktuTayang = input.nextInt();
		System.out.println();//Ini jg
		System.out.print("(1)Reguler (2)Deluxe (3)Premium\nMasukkan jenis studio (angka): ");
		int input_Studio = input.nextInt();
		System.out.println(); //Sama yang ini deh
		input.close();
		
		String hari="", waktuTayang="", Studio="";
		int biayaHari=0, biayaWaktu=0, biayaStudio=0;
		boolean validFlag=true;
		
		switch(input_hari){
		case 1:hari= "Senin-Kamis"; biayaHari= 10;break;
		case 2:hari= "Jumat"; biayaHari= 20;break;
		case 3:hari= "Sabtu-Minggu";biayaHari= 30;break;
		default:validFlag=false;}
		
		switch(input_waktuTayang) {
		case 1:waktuTayang= "Pagi (10:10-12:00)";biayaWaktu = 10;break;
		case 2:waktuTayang= "Siang (12:00-17:00)";biayaWaktu = 15;break;
		case 3:waktuTayang= "Malam (17:00-22:00)";biayaWaktu = 20;break;
		default:validFlag=false;}
		
		switch(input_Studio){
		case 1:Studio= "Regular";biayaStudio= 35000;break;
		case 2:Studio= "Deluxe";biayaStudio= 50000;break;
		case 3:Studio= "Premium";biayaStudio = 65000;break;
		default:validFlag=false;}
		
		int tempDiskon=0;
		if(jumlahTiket >=7) {
			tempDiskon = 30;
		}
		else if(jumlahTiket >=3 && jumlahTiket <7) {
			tempDiskon = 20;
		}
	int hargaPerTiket = biayaStudio + (biayaStudio * biayaHari / 100) + (biayaStudio * biayaWaktu / 100);
	int Subtotal = jumlahTiket * hargaPerTiket;
	int Diskon = (Subtotal*tempDiskon)/100;
	int Total = Subtotal - Diskon;
	
	if(validFlag) {
	System.out.println();
	System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
	System.out.printf("%-20s: %s\n", "Nama Pembeli", nama);
	System.out.printf("%-20s: %d\n", "Jumlah Tiket", jumlahTiket);
	System.out.printf("%-20s: %s\n", "Hari", hari);
	System.out.printf("%-20s: %s\n", "Waktu Tayang", waktuTayang);
	System.out.printf("%-20s: %s\n", "Jenis Studio", Studio);
	System.out.println("------------------------------------");	

	System.out.printf("%-20s: Rp%d/tiket\n", "Harga Dasar", biayaStudio);
	System.out.printf("%-20s: +%d%%\n", "Biaya Hari", biayaHari);
	System.out.printf("%-20s: +%d%%\n", "Biaya Waktu", biayaWaktu);
	System.out.printf("%-20s: Rp%d\n", "Harga per Tiket", hargaPerTiket);
	System.out.printf("%-20s: Rp%d\n", "Subtotal", Subtotal);
	System.out.printf("%-20s: Rp%d\n", "Diskon" + "(" + tempDiskon +"%)", Diskon);
	System.out.println("------------------------------------");
	System.out.printf("%-20s: Rp%d\n", "TOTAL BAYAR", Total);
	}
	else System.out.println("Satu atau lebih input tidak sah!");
	} 
}