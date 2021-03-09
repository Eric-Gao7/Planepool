package fake;

import java.util.ArrayList;
import java.util.List;

import dao.Flight;
import dao.User;

public class User_DAO_fakeimpl {

	List<User> getUsers() {

		List<User> a = new ArrayList<User>();
		User b = new User("titi", "tata");
		a.add(b);
		return a;

	}

	User getUser() {
		User b = new User("titi", "tata");
		return b;
	}

	User getuser(String name) {
		User b = new User("titi", "tata");
		return b;
	}

	User getuser(int id) {
		User b = new User("titi", "tata");
		return b;

	}

	void putDeparture(String Departure) {

	}

	void putDate(String Date) {

	}

	void putId(String mail, String password) {

	}

	void postProfile(String profile) {

	}

	List<Flight> getFlights() {
		List<Flight> a = new ArrayList<Flight>();
		Flight b = new Flight("first_fly");
		a.add(b);
		return a;

	}
}
