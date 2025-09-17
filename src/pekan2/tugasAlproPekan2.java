package pekan2;

public class tugasAlproPekan2 {
	 public static void main(String[] args) {
		 int banyakBarang = 3;
		 float hargaKopi= 8.5f;
		 char ukuran = 'M';
		 boolean dingin = true; 
		 float total = banyakBarang * hargaKopi;
		 String suhu;
		 
		 if(dingin) {
			 suhu = "dingin";
		 }
		 else suhu = "panas";
		 
		 System.out.println("===Total Harga Kopi===");
		 System.out.println("Pembelian " + banyakBarang + " gelas kopi " + suhu + " ukuran " + ukuran + " dengan total $" + total);
		 
	 }
}
