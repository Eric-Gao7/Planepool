package main.java.dao;

import java.util.List;

public interface User_pilot_DAO {

	
	void deleteFlight(String name);
	void postInformation(String Information);
	void putRequest(boolean answer);
	List<User> getPassenger(Flight flight);
	
}
