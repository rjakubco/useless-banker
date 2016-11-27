package org.home.project.webservices;

import org.home.project.dao.CategoryDao;
import org.home.project.entities.Category;
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
@Path("/categoryService")
public class CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	@POST
	@Path("/createCategory")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createCategory(Category category) {
		return categoryDao.createCategory(category);
	}

	@GET
	@Path("/getCategories")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getAllCategories() {
		return categoryDao.findAllCategories();
	}

	@GET
	@Path("/getCategory/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Category getCategoryById(@PathParam("id") String id) {
		return categoryDao.findCategoryById(id);
	}

	@DELETE
	@Path("/deleteCategory")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteCategory(Category category) {
		categoryDao.deleteCategory(category);
	}

	@POST
	@Path("/updateCategory")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateMerchant(Category category) {
		return categoryDao.updateCategory(category);
	}
}
