package dao;

import java.util.List;

public interface User_DAO {
	
	List<User> getUsers();
	User getUser();
	User getuser(String name);
	User getuser(int id);
	void putDeparture(String Departure);
	void putDate(String Date);
	void putId(String mail,String password);
	void postProfile(String profile);
	List<Flight> getFlights();

}
