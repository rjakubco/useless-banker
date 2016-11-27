package org.home.project.webservices;

import org.home.project.dao.TransactionDao;
import org.home.project.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Path("/transactionService")
public class TransactionService {
	@Autowired
	private TransactionDao transactionDao;

	@POST
	@Path("/updateTransaction")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateTransaction(Transaction transaction) {
		return transactionDao.updateTransaction(transaction);
	}
}
