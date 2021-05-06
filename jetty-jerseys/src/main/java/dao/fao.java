package dao;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import impl.Flight_DAO_impl;
import impl.User_DAO_impl;

public class fao {

	private static User_DAO userDao = null;
	private static Flight_DAO flightDao = null;
	static PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("DataSource");

	public static User_DAO getUser_DAO() {
		if (userDao == null) {

			userDao = new User_DAO_impl(pmf);
		}

		return userDao;
	}

	public static Flight_DAO getFlight_DAO() {
		if (flightDao == null) {

			flightDao = new Flight_DAO_impl(pmf);
		}

		return flightDao;
	}

}
