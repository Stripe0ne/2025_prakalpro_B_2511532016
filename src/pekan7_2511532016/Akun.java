package pekan7_2511532016;

public class Akun{
	
//BAGIAN PENYIMPANAN DATA
private String username, password, email;
private int pinAngka;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPin(int pin) {
		this.pinAngka = pin;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public int getPin() {
		return pinAngka;
	}
	//BAGIAN VALIDASI DATA
	public boolean isEmailValid (String email) {
		if(email.contains("@") && email.contains(".")) return true;
		else return false;
	}
	
	public boolean isPasswordValid (String password) {
		if(password.length() >= 8) return true;
		else return false;
	}
}

