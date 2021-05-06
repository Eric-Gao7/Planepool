package fake;

import java.util.List;

import dao.Flight;
import dao.Flight_DAO;

public class Flight_DAO_fakeimpl implements Flight_DAO {

	public void putInformation_flight(String Information) {

	}

	public String getInformation_flight() {
		Flight a = new Flight("first_fly");
		String info = "";
		info += a.getName() + " " + a.getDeparture() + " " + a.getPlace() + " " + a.getType_plane();
		return info;
	}

	public void putInformation_pilot(String Information) {

	}

	public String getInformation_pilot() {
		Flight b = new Flight("first_fly");
		return b.getPilot_profile();

	}

	public void postPlace(int place) {

	}

	public void deleteFlight(String name) {

	}

	public void postInformation_flight(String Information, long id) {
		// TODO Auto-generated method stub

	}

	public String getInformation_flight(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void postInformation_pilot(String Information, long id) {
		// TODO Auto-generated method stub

	}

	public String getInformation_pilot(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> getFlights(String departure, int date) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteFlight(long id) {
		// TODO Auto-generated method stub

	}

	public Flight getFlight(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public long addFlight(Flight utilisateur) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void postPlace(long id, int place) {
		// TODO Auto-generated method stub

	}

	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	public void postOtherinformation(long id, int duration, int price, String added_information, String type_plane,
			String arrival, boolean accept) {
		// TODO Auto-generated method stub

	}

}
