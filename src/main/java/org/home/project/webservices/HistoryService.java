package org.home.project.webservices;

import org.home.project.dao.HistoryDao;
import org.home.project.entities.History;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Path("/historyService")
public class HistoryService {
	@Autowired
	private HistoryDao historyDao;

	@POST
	@Path("/createHistory")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createHistory(History history) {
		return historyDao.createHistory(history);
	}

	@GET
	@Path("/getHistory/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public History findHistory(@PathParam("id") String historyId) {
		return historyDao.findHistoryById(historyId);
	}

	@GET
	@Path("/getHistoryByUser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public History findHistoryByUserId(@PathParam("id") String userId) {
		return historyDao.findHistoryByUserId(userId);
	}

	@POST
	@Path("/updateHistory")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateHistory(History history) {
		return historyDao.updateHistory(history);
	}

	@DELETE
	@Path("/deleteHistory")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteHistory(History history) {
		historyDao.deleteHistory(history);
	}
}
