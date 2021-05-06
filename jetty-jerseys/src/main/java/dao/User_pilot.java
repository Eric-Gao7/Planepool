package dao;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class User_pilot extends User {

	public User_pilot(String name, String password) {
		super(name, password);
		// TODO Auto-generated constructor stub
	}

	public User_pilot() {
		// TODO Auto-generated constructor stub
		super();
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
