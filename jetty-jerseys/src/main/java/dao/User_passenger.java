package dao;

import java.util.List;

public class User_passenger extends User {
	
	public User_passenger(String name, String password) {
		super(name, password);
		// TODO Auto-generated constructor stub
	}

	private List<Flight> flight_request;

	public List<Flight> getFlight_request() {
		return flight_request;
	}

	public void setFlight_request(List<Flight> flight_request) {
		this.flight_request = flight_request;
	}

}
