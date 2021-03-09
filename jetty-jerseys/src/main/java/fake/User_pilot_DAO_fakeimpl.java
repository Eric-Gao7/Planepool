package fake;

import java.util.List;

import dao.Flight;
import dao.User;
import dao.User_pilot;

public class User_pilot_DAO_fakeimpl {

	void deleteFlightp(String name) {

	}

	void postInformation(String Information) {

	}

	void putRequest(boolean answer) {

	}

	List<User> getPassenger(Flight flight) {

		User a = new User_pilot("ttti", "tata");
		Flight b = new Flight("first_fly");
		a.addFlight(b);
		for (Flight f : a.getFlights()) {
			if (f.getName().equals(flight.getName())) {
				return f.getUsers();
			}
		}
		return null;

	}

}
