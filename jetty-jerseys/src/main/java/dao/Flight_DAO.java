package dao;

public interface Flight_DAO {
	
	
	void putInformation_flight(String Information);
	String getInformation_flight();
	void putInformation_pilot(String Information);
	String getInformation_pilot();
	void postPlace(int place);
	

}
