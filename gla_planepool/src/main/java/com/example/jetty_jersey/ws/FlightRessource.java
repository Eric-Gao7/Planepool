package main.java.com.example.jetty_jersey.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.java.com.example.jetty_jersey.ws.ExampleResource.ExampleClass;
import main.java.dao.Flight;

@Path("/flight")

public class FlightRessource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public String getInformation_flight() {
		System.out.println("ok");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public String getInformation_pilot() {
		System.out.println("ok");
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
