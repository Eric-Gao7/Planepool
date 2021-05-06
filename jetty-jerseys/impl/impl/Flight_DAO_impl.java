package impl;

import java.util.List;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import dao.Flight;
import dao.Flight_DAO;
import dao.User;

public class Flight_DAO_impl implements Flight_DAO {

	private PersistenceManagerFactory pmf;

	public Flight_DAO_impl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	public void postInformation_flight(String Information, long id) {

		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			Flight fly = pm.getObjectById(Flight.class, id);
			if (fly != null) {
				fly.setJourney_information(Information);
				fly = pm.makePersistent(fly);
				tx.commit();
			}

		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();

		}

	}

	// **********
	public String getInformation_flight(long id) {

		String info;
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			Flight fly = pm.getObjectById(Flight.class, id);
			Flight detached = pm.detachCopy(fly);
			info = detached.getJourney_information();
			return info;
		} catch (JDOObjectNotFoundException e) {
			return null;
		} finally {
			pm.close();
		}
	}

	public void postInformation_pilot(String Information, long id) {

		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			Flight fly = pm.getObjectById(Flight.class, id);
			if (fly != null) {
				fly.setPilot_profile(Information);
				fly = pm.makePersistent(fly);
				tx.commit();
			}

		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();

		}

	}

	public String getInformation_pilot(long id) {
		PersistenceManager pm = pmf.getPersistenceManager();
		try {

			Flight fly = pm.getObjectById(Flight.class, id);
			Flight detached = pm.detachCopy(fly);
			String info_pilot = detached.getPilot_profile();
			return info_pilot;

		} finally {

			pm.close();
		}

	}

	public List<User> getUserf(long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		try {

			Flight fly = pm.getObjectById(Flight.class, id);
			Flight detached = pm.detachCopy(fly);
			List<User> list = detached.getUsers();
			return list;

		} finally {

			pm.close();
		}
	}

	public long addFlight(Flight fly) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		fly = pm.makePersistent(fly);
		pm.close();
		return fly.getId();
	}

	public void deleteFlight(long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();
		try {
			((javax.jdo.Transaction) tx).begin();
			Flight u = pm.getObjectById(Flight.class, id);
			pm.deletePersistent(u);
			tx.commit();
		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public void postPlace(long id, int place) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			Flight fly = pm.getObjectById(Flight.class, id);
			if (fly != null) {
				fly.setPlace(place);
				fly = pm.makePersistent(fly);
				tx.commit();
			}

		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();

		}
	}

	public Flight getFlight(long id) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();

		try {
			Flight utilisateur = pm.getObjectById(Flight.class, id);
			Flight detached = pm.detachCopy(utilisateur);

			return detached;
		} catch (JDOObjectNotFoundException e) {
			return null;
		} finally {
			pm.close();
		}
	}

//********
	public List<Flight> getFlights(String departures, int dates) {
		// TODO Auto-generated method stub

		List<Flight> actions = null;
		List<Flight> detached = null;
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			javax.jdo.Query q = pm.newQuery(Flight.class);
			q.declareParameters("String departures,int dates");
			if (!departures.contentEquals("")) {
				q.setFilter("departure == departures");
			}
			if (dates != 0) {
				q.setFilter("date == dates");
			}

			actions = (List<Flight>) q.execute(departures, dates);
			detached = (List<Flight>) pm.detachCopyAll(actions);
			tx.commit();
		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

	public List<Flight> getFlights() {
		// TODO Auto-generated method stub

		List<Flight> actions = null;
		List<Flight> detached = null;
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			javax.jdo.Query q = pm.newQuery(Flight.class);
			actions = (List<Flight>) q.execute();
			detached = (List<Flight>) pm.detachCopyAll(actions);
			tx.commit();
		} finally {
			if (((javax.jdo.Transaction) tx).isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

	public void postOtherinformation(long id, int duration, int price, String added_information, String type_plane,
			String arrival, boolean accept) {
		// TODO Auto-generated method stub
		PersistenceManager pm = pmf.getPersistenceManager();
		javax.jdo.Transaction tx = pm.currentTransaction();

		try {
			((javax.jdo.Transaction) tx).begin();
			Flight fly = pm.getObjectById(Flight.class, id);
			if (fly != null) {
				fly.setDuration(duration);
				fly.setAdded_information(added_information);
				fly.setArrival(arrival);
				fly.setAccept(accept);
				fly.setPrice(price);
				fly.setType_plane(type_plane);
				fly = pm.makePersistent(fly);
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
