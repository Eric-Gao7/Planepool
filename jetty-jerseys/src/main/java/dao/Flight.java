package dao;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Flight {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
	protected Long id = null;
	private String name;
	private String pilot_profile;
	private int place;
	private int duration;
	private int date;
	private int price;
	private String journey_information;
	private String added_information;
	private String type_plane;
	private String departure;
	private String arrival;
	public boolean accept;
	private List<User> users;

	List<Flight> search(String date, String departure) {

		return null;

	}

	public Flight(String name) {
		super();
		this.name = name;
	}

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public String getPilot_profile() {
		return pilot_profile;
	}

	public void setPilot_profile(String pilot_profile) {
		this.pilot_profile = pilot_profile;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getJourney_information() {
		return journey_information;
	}

	public void setJourney_information(String journey_information) {
		this.journey_information = journey_information;
	}

	public String getAdded_information() {
		return added_information;
	}

	public void setAdded_information(String added_information) {
		this.added_information = added_information;
	}

	public String getType_plane() {
		return type_plane;
	}

	public void setType_plane(String type_plane) {
		this.type_plane = type_plane;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
