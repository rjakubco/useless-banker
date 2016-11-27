package org.home.project.dao;

import org.home.project.entities.Category;
import org.mongojack.DBCursor;
import org.mongojack.JacksonDBCollection;
import org.mongojack.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.DB;
import com.mongodb.DBCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Service
public class CategoryDao {
	@Autowired
	private DB mongoDatabase;

	public String createCategory(Category category) {
		WriteResult<Category, String> writeResult = getCollection().insert(category);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		return writeResult.getSavedId();
	}

	public Category findCategoryById(String categoryId) {
		return getCollection().findOneById(categoryId);
	}

	public List<Category> findAllCategories() {
		List<Category> userList = new ArrayList<Category>();
		DBCursor<Category> users = getCollection().find();
		while (users.hasNext()) {
			userList.add(users.next());
		}
		return userList;
	}

	public void deleteCategory(Category category) {
		WriteResult<Category, String> writeResult = getCollection().removeById(category.getId());
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
	}

	public String updateCategory(Category category) {
		WriteResult<Category, String> writeResult = getCollection().updateById(category.getId(), category);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			//
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		// what to return?
		return writeResult.getWriteResult().toString();
	}

	private JacksonDBCollection<Category, String> getCollection() {
		DBCollection dbCollection = mongoDatabase.getCollection("histories");
		JacksonDBCollection<Category, String> transactionColletion = JacksonDBCollection.wrap(dbCollection, Category.class, String.class);

		return transactionColletion;
	}
}
