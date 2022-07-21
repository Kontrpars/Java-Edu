package gameOperationsApp;

public class Gamer {
	private String username;
	private String password;
	private String email;
	private String age;
	public Gamer() {}
	
	public Gamer(String username, String password, String email, String age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
