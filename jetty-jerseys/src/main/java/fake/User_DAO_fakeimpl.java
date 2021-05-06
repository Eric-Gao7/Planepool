package fake;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import dao.Flight;
import dao.User;
import dao.User_DAO;

public class User_DAO_fakeimpl implements User_DAO {

	public List<User> getUsers() {

		List<User> a = new ArrayList<User>();
		User b = new User("titi", "tata");
		a.add(b);
		return a;

	}

	public User getUser() {
		User b = new User("titi", "tata");
		return b;
	}

	public User getuser(String name) {
		User b = new User("titi", "tata");
		return b;
	}

	public User getuser(int id) {
		User b = new User("titi", "tata");
		return b;

	}

	public void putDeparture(String Departure) {
		/* tries */

	}

	public void putDate(String Date) {

	}

	public void putId(String mail, String password) {

	}

	public void postProfile(String profile) {

	}

	public List<Flight> getFlights() {
		List<Flight> a = new ArrayList<Flight>();
		Flight b = new Flight("first_fly");
		a.add(b);
		return a;

	}

	public List<User> getUser(String name) throws SecurityException, IllegalStateException, RollbackException,
			HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public long addUser(String utilisateur) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteUser(long id) {
		// TODO Auto-generated method stub

	}

	public void postRequest(long id, boolean request) {
		// TODO Auto-generated method stub

	}

	public long addUsers(User utilisateur) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User getUser(String mail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void postProfile(String profile, long id) {
		// TODO Auto-generated method stub

	}

	public void postName(String name, long id) {
		// TODO Auto-generated method stub

	}

	public void postFlight(Flight flight, long id) {
		// TODO Auto-generated method stub

	}
}
