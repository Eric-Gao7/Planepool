package com.example.jetty_jersey.ws;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
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
import dao.User;
import dao.fao;

@Path("/home")
public class HomeResources {

	// pas tester encore
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public boolean login(@FormParam("mail") String mail, @FormParam("password") String password) {
		User conect = fao.getUser_DAO().getUser(mail, password);
		if (conect == null)
			return false;

		return true;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/priority")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void postRequest(@FormParam("id") long id, @FormParam("request") boolean request) {
		fao.getUser_DAO().postRequest(id, request);

	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public void deleteUser(@PathParam("id") long id) {
		fao.getUser_DAO().deleteUser(id);

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/connection/{id}")
	public User getUser(@PathParam("id") long id) {
		User utilisateur = fao.getUser_DAO().getUser(id);

		if (utilisateur == null) {
			throw new NotFoundException("Invalid user id");
		}

		return utilisateur;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/search/{departure}/{date}")
	public List<Flight> getFlights(@PathParam("departure") String departure, @PathParam("date") int date) {

		List<Flight> test_result = null;
		try {
			test_result = fao.getFlight_DAO().getFlights(departure, date);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (test_result == null) {
			throw new NotFoundException("Invalid parameter");
		}
		return test_result;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/search")
	public List<Flight> getFlights() {

		List<Flight> test_result = null;
		try {
			test_result = fao.getFlight_DAO().getFlights();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (test_result == null) {
			throw new NotFoundException("Invalid parameter");
		}
		return test_result;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/connect/{name}")
	public List<User> getUser(@PathParam("name") String name) {
		List<User> utilisateur = null;
		try {
			utilisateur = fao.getUser_DAO().getUser(name);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (utilisateur == null) {
			throw new NotFoundException("Invalid user name");
		}

		return utilisateur;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/connect")
	public List<User> getUserall() throws Exception {
		List<User> utilisateur = null;
		try {
			utilisateur = fao.getUser_DAO().getUsers();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (utilisateur == null) {
			throw new NotFoundException("Invalid user name");
		}

		return utilisateur;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{utilisateur}/connection")
	public long addUser(@PathParam("utilisateur") String utilisateur) {
		if (utilisateur == null) {
			throw new BadRequestException("Missing payload");
		}
		long a = fao.getUser_DAO().addUser(utilisateur);
		System.out.println(a);
		return a;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/connection")
	public long addUsers(User utilisateur) {
		if (utilisateur == null) {
			throw new BadRequestException("Missing payload");
		}
		long b = fao.getUser_DAO().addUsers(utilisateur);
		System.out.println(b);
		return b;

	}

}
