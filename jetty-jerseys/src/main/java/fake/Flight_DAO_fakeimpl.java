package fake;

import dao.Flight;

public class Flight_DAO_fakeimpl {

	void putInformation_flight(String Information) {

	}

	String getInformation_flight() {
		Flight a = new Flight("first_fly");
		String info = "";
		info += a.getName() + " " + a.getDeparture() + " " + a.getPlace() + " " + a.getType_plane();
		return info;
	}

	void putInformation_pilot(String Information) {

	}

	String getInformation_pilot() {
		Flight b = new Flight("first_fly");
		return b.getPilot_profile();

	}

	void postPlace(int place) {

	}

}
