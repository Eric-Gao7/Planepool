package com.example.jetty_jersey.ws;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.Flight;
import dao.fao;

@Path("/flight")

public class FlightRessource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight/{id}")
	public String getInformation_flight(@PathParam("id") long id) {

		return fao.getFlight_DAO().getInformation_flight(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pilot/{id}")
	public String getInformation_pilot(@PathParam("id") long id) {
		return fao.getFlight_DAO().getInformation_pilot(id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/information")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void putInformation_flight(@FormParam("information") String Information, @FormParam("id") long id) {
		fao.getFlight_DAO().postInformation_flight(Information, id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/informations")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void postOtherinformation(@FormParam("id") long id, @FormParam("duration") int duration,
			@FormParam("price") int price, @FormParam("added_information") String added_information,
			@FormParam("type_plane") String type_plane, @FormParam("arrival") String arrival,
			@FormParam("accept") boolean accept) {
		fao.getFlight_DAO().postOtherinformation(id, duration, price, added_information, type_plane, arrival, accept);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/info_pilot")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void putInformation_pilot(@FormParam("information") String Information, @FormParam("id") long id) {
		fao.getFlight_DAO().postInformation_pilot(Information, id);

	}

//****
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/place")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void postPlace(@FormParam("id") long id, @FormParam("place") int place) {
		fao.getFlight_DAO().postPlace(id, place);
	}

	// *******

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public void deleteFlight(@PathParam("id") long id) {
		fao.getFlight_DAO().deleteFlight(id);

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/connection/{id}")
	public Flight getFlight(@PathParam("id") long id) {
		Flight utilisateur = fao.getFlight_DAO().getFlight(id);

		if (utilisateur == null) {
			throw new NotFoundException("Invalid user id");
		}

		return utilisateur;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/ajout")
	public long addFlight(Flight utilisateur) {
		if (utilisateur == null) {
			throw new BadRequestException("Missing payload");
		}
		long b = fao.getFlight_DAO().addFlight(utilisateur);
		System.out.println(b);
		return b;

	}

}
