package dao;

public class User {
	 private String name;
	 private String password;
	 private int id;
	 private static int user_id = 1;
	 private String mail;
	 private int acces;
	 private String profile;
	 
	 public User(String name, String password) {
			this.id=user_id++;
			this.name = name;
			this.password = password;		
		}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return this.id;
	}
	public int getAcces() {
		return acces;
	}
	public void setAcces(int acces) {
		this.acces = acces;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	

}
