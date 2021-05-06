package com.example.jetty_jersey.ws;

import java.util.List;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.Flight;
import dao.User;
import dao.fao;

@Path("/profile")
public class ProfileRessource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/info")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void postProfile(@FormParam("profile") String profile, @FormParam("id") long id) {
		fao.getUser_DAO().postProfile(profile, id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/info_name")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void postName(@FormParam("name") String name, @FormParam("id") long id) {
		fao.getUser_DAO().postName(name, id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pilot/{id}")
	public List<User> getPassenger(@PathParam("id") long id) {

		return fao.getFlight_DAO().getFlight(id).getUsers();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight/{id}")
	public void postFlight(Flight flight, @PathParam("id") long id) {
		if (flight == null) {
			throw new BadRequestException("Missing payload");
		}
		fao.getUser_DAO().postFlight(flight, id);

	}

}
