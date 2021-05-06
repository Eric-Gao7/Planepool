package impl;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import dao.Flight;
import dao.User;
import dao.User_DAO;

public class User_DAO_impl implements User_DAO {

	private PersistenceManagerFactory pmf;

	public User_DAO_impl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	public List<Flight> getFlights(long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			User utilisateur = pm.getObjectById(User.class, id);
			User detached = pm.detachCopy(utilisateur);
			List<Flight> list = detached.getFlights();
			return list;

		} finally {

			pm.close();
		}
	}

	public List<User> getUser(String name) throws SecurityException, IllegalStateException, RollbackException,
			HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		List<User> actions = null;
		List<User> detached = null;
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();
		try {
			((javax.jdo.Transaction) tx).begin();
			javax.jdo.Query q = pm.newQuery(User.class);
			q.declareParameters("String user");
			q.setFilter("name == user");
			actions = (List<User>) q.execute(name);
			detached = (List<User>) pm.detachCopyAll(actions);
			tx.commit();
		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

	public List<User> getUsers() throws SecurityException, IllegalStateException, RollbackException,
			HeuristicMixedException, HeuristicRollbackException, SystemException {
// TODO Auto-generated method stub
		List<User> actions = null;
		List<User> detached = null;
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();
		try {
			((javax.jdo.Transaction) tx).begin();
			javax.jdo.Query q = pm.newQuery(User.class);
			actions = (List<User>) q.execute();
			detached = (List<User>) pm.detachCopyAll(actions);
			tx.commit();
		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

	// ********
	public User getUser(long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();

		try {
			User utilisateur = pm.getObjectById(User.class, id);
			User detached = pm.detachCopy(utilisateur);

			return detached;
		} catch (JDOObjectNotFoundException e) {
			return null;
		} finally {
			pm.close();
		}
	}

	public User getUser(String mails, String passwords) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		List<User> u = null;
		List<User> detached = null;
		javax.jdo.Transaction tx = pm.currentTransaction();
		try {
			((javax.jdo.Transaction) tx).begin();
			javax.jdo.Query q = pm.newQuery(User.class);
			q.declareParameters("String mails");
			q.setFilter("mail == mails");
			u = (List<User>) q.execute(mails);
			detached = (List<User>) pm.detachCopyAll(u);
			System.out.println();
			tx.commit();
		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		for (User i : detached) {
			if (i.getPassword().equals(passwords)) {
				return i;
			}
		}

		return null;
	}

	public long addUser(String util) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		String[] a = util.split("_", 2);

		User utilisateur = new User(a[0], a[1]);
		utilisateur = pm.makePersistent(utilisateur);
		long utilisateurId = utilisateur.getId();
		pm.close();

		return utilisateurId;
	}

	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();
		try {
			((javax.jdo.Transaction) tx).begin();
			User u = pm.getObjectById(User.class, id);
			pm.deletePersistent(u);
			tx.commit();
		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public void postRequest(long id, boolean request) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			User utilisateur = pm.getObjectById(User.class, id);
			if (utilisateur != null) {
				utilisateur.setAcces(true);
				utilisateur = pm.makePersistent(utilisateur);
				tx.commit();
			}

		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();

		}

	}

	public long addUsers(User util) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		util = pm.makePersistent(util);
		pm.close();
		return util.getId();
	}

	public void postProfile(String profile, long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			User utilisateur = pm.getObjectById(User.class, id);
			if (utilisateur != null) {
				utilisateur.setProfile(profile);
				utilisateur = pm.makePersistent(utilisateur);
				tx.commit();
			}

		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();

		}

	}

	public void postName(String name, long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			User utilisateur = pm.getObjectById(User.class, id);
			if (utilisateur != null) {
				utilisateur.setName(name);
				utilisateur = pm.makePersistent(utilisateur);
				tx.commit();
			}

		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();

		}

	}

	// Probleme colom
	public void postFlight(Flight flight, long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			System.out.println("name =" + flight.getName());
			List<Flight> flights = new ArrayList<Flight>();
			((javax.jdo.Transaction) tx).begin();
			User utilisateur = pm.getObjectById(User.class, id);
			if (utilisateur != null) {
				flights.add(flight);
				utilisateur.setFlights(flights);
				utilisateur = pm.makePersistent(utilisateur);
				tx.commit();
			}

		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();

		}
	}

}
