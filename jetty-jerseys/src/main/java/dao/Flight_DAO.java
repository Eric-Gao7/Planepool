package dao;

import java.util.List;

public interface Flight_DAO {

	void postInformation_flight(String Information, long id);

	String getInformation_flight(long id);

	void postInformation_pilot(String Information, long id);

	String getInformation_pilot(long id);

	List<Flight> getFlights(String departure, int date);

	void deleteFlight(long id);

	Flight getFlight(long id);

	long addFlight(Flight utilisateur);

	void postPlace(long id, int place);

	List<Flight> getFlights();

	void postOtherinformation(long id, int duration, int price, String added_information, String type_plane,
			String arrival, boolean accept);

}
