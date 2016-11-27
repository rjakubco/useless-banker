package org.home.project.webservices;

import org.home.project.dao.UserDao;
import org.home.project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Path("/userService")
public class UserService {
	@Autowired
	private UserDao userDao;

	@GET
	@Path("/getUsers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers() {
		return userDao.findAllUsers();
	}

	@GET
	@Path("/getUser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("id") String id) {
		return userDao.findUserById(id);
	}

	@GET
	@Path("/getUserByName/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserByUsername(@PathParam("username") String username) {
		return userDao.findUserByName(username);
	}

	@POST
	@Path("/saveUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createUser(User user) {
		return userDao.createUser(user);
	}

	@DELETE
	@Path("/removeUser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUser(@PathParam("id") String id) {
		userDao.deleteUser(userDao.findUserById(id));
	}

	@DELETE
	@Path("/removeUser")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@POST
	@Path("/updateUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateUser(User user) {
		return userDao.updateUser(user);
	}
}