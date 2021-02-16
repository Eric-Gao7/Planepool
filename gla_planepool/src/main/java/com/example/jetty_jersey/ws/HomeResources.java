package main.java.com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.java.com.example.jetty_jersey.ws.ExampleResource.ExampleClass;

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
	public void putDeparture(String Date) {
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
	public void putId(String mail,String password) {
		System.out.println("ok");
	}
	
	
	
	

}
