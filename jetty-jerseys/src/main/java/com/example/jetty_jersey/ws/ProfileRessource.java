package com.example.jetty_jersey.ws;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.Flight;
import dao.User;

@Path("/profile")
public class ProfileRessource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{profile}")
	public void postProfile(@PathParam("profile") String profile) {
		System.out.println("ok_profile");
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/information/{information}")
	public void postInformation(@PathParam("information") String Information) {
		System.out.println("ok_information");
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pilot/{flight}")
	public void deleteFlightp(@PathParam("flight") String flight) {
		System.out.println("ok");
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{flight}")
	public void deleteFlight(@PathParam("flight") String flight) {
		System.out.println("ok");
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pilot/{request}")
	public void putRequest(@PathParam("request") boolean answer) {
		System.out.println("ok_request");
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pilot/{flight}")
	public List<User> getPassenger(@PathParam("flight") String flightid) {
		Flight flights = new Flight(flightid);
		if (flightid == null) {
			throw new NotFoundException();
		}
		System.out.println("ok");
		return flights.getUsers();
	}

}
