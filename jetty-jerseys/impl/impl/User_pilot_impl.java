package impl;

import java.util.List;

import javax.jdo.PersistenceManagerFactory;

import dao.Flight;
import dao.User;
import dao.User_pilot_DAO;

public class User_pilot_impl implements User_pilot_DAO {

	private PersistenceManagerFactory pmf;

	public void UserDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	public void deleteflight(String flight) {

	}

	public void postInformation(String Information, String name) {
		// TODO Auto-generated method stub

	}

	public void putRequest(boolean answer, String name) {
		// TODO Auto-generated method stub

	}

	public List<User> getPassenger(String flight) {
		return null;
		// TODO Auto-generated method stub

	}

	public void deleteFlightp(String name) {
		// TODO Auto-generated method stub

	}

	public void postInformation(String Information) {
		// TODO Auto-generated method stub

	}

	public void putRequest(boolean answer) {
		// TODO Auto-generated method stub

	}

	public List<User> getPassenger(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

}
