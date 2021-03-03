package dao;

public class Flight {
	
	private String pilot_profile;
	private int place;
	private int duration;
	private int price;
	private String journey_information;
	private String added_information;
	private String type_plane;
	private String departure;
	private String arrival;
	public boolean accept;
	
	
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

}
