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
import main.java.dao.User;

@Path("/profile")
public class ProfileRessource {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{profile}")
	public void postProfile(String profile) {
		System.out.println("ok");
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{information}")
	public void postInformation(String Information) {
		System.out.println("ok");
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{flight}")
	public void deleteflight(String flight) {
		System.out.println("ok");
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pilot/{flight}")
	public void deleteflight(String flight) {
		System.out.println("ok");
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{flight}")
	public void deleteflight(String flight) {
		System.out.println("ok");
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pilot/{request}")
	public void putRequest(boolean answer) {
		System.out.println("ok");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pilot/{flight}")
	public List<User> getPassenger(Flight flight) {
		System.out.println("ok");
	}
	
	

}
