package dao;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

public interface User_DAO {

	List<User> getUsers() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, Exception;

	List<User> getUser(String name) throws SecurityException, IllegalStateException, RollbackException,
			HeuristicMixedException, HeuristicRollbackException, SystemException;

	User getUser(long id);

	long addUser(String utilisateur);

	void deleteUser(long id);

	void postRequest(long id, boolean request);

	long addUsers(User utilisateur);

	User getUser(String mail, String password);

	void postProfile(String profile, long id);

	void postName(String name, long id);

	void postFlight(Flight flight, long id);

}
