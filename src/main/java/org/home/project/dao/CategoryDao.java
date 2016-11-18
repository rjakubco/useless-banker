package org.home.project.dao;

import org.home.project.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.client.MongoDatabase;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Service
public class CategoryDao {
	@Autowired
	private MongoDatabase mongoDatabase;

	public Category createCategory(Category category) {
		return null;
	}

	public Category findCategoryById(String id) {
		return null;
	}

	public Category findCategory(Category category) {
		return null;
	}

	public void deleteCategory(Category category) {
		return;
	}

	public Category updateCategory(Category category) {
		return null;
	}
}
