package dao;

public class User_pilot extends User {

	public User_pilot(String name, String password) {
		super(name, password);
		// TODO Auto-generated constructor stub
	}

	private String plane;
	private int note;

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

}
