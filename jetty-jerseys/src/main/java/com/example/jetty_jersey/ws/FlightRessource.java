package com.example.jetty_jersey.ws;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/flight")

public class FlightRessource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight")
	public String getInformation_flight() {
		System.out.println("ok");
		return "ok";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pilot")
	public String getInformation_pilot() {
		System.out.println("ok");
		return null;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public void putInformation_flight(@PathParam("information") String Information) {
		System.out.println("ok");
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}/pilot")
	public void putInformation_pilot(@PathParam("information") String Information) {
		System.out.println("ok");
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{place}")
	public void postPlace(@PathParam("place") int place) {
		System.out.println("ok");
	}

}
