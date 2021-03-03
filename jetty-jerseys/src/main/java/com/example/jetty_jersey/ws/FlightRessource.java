package com.example.jetty_jersey.ws;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/flight")

public class FlightRessource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public String getInformation_flight() {
		System.out.println("ok");
		return "ok";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public String getInformation_pilot() {
		System.out.println("ok");
		return null;
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public void putInformation_flight(String Information) {
		System.out.println("ok");
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public void putInformation_pilot(String Information) {
		System.out.println("ok");
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{place}")
	public void postPlace(int place) {
		System.out.println("ok");
	}

	
}
