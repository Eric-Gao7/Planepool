package com.example.jetty_jersey.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import dao.Flight;

@Path("/home")
public class HomeResources {
	
	
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{departure}")
	public void putDeparture(String Departure) {
		System.out.println("ok");
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{date}")
	public void putDate(String Date) {
		System.out.println("ok");
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{connexion}")
	public void putConnexion() {
		System.out.println("ok");
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/login")
	public void putId(String mail_password) {
		System.out.println("ok");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{search}")
	public List<Flight> getFlights() {
		System.out.println("ok");
		return null;
	}
	
	
	

}
