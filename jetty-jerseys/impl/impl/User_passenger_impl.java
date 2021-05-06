package impl;

import java.util.List;

import javax.jdo.PersistenceManagerFactory;

import dao.Flight;
import dao.User;
import dao.User_passenger_DAO;

public class User_passenger_impl implements User_passenger_DAO {

	private PersistenceManagerFactory pmf;

	public void UserDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	public void deleteflight(String flight) {

	}

	public void putflight(Flight flight, String names) {

	}

	public List<User> getUserx(String search) {
		return null;
		// TODO Auto-generated method stub

	}

	public void putflight(Flight flight) {
		// TODO Auto-generated method stub

	}

}
