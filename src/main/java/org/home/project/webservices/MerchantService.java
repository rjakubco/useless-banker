package org.home.project.webservices;

import org.home.project.dao.MerchantDao;
import org.home.project.entities.Merchant;
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
@Path("/merchantService")
public class MerchantService {

	@Autowired
	private MerchantDao merchantDao;

	@POST
	@Path("/createMerchant")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createMerchant(Merchant merchant) {
		return merchantDao.createMerchant(merchant);
	}

	@GET
	@Path("/getMerchants")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Merchant> getAllMerchants() {
		return merchantDao.findAllMerchants();
	}

	@GET
	@Path("/getMerchant/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Merchant getMerchantById(@PathParam("id") String id) {
		return merchantDao.findMerchantById(id);
	}

	@DELETE
	@Path("/deleteMerchant")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteMerchant(Merchant merchant) {
		merchantDao.deleteMerchant(merchant);
	}

	@POST
	@Path("/updateMerchants")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateMerchant(Merchant merchant) {
		return merchantDao.updateMerchant(merchant);
	}
}
