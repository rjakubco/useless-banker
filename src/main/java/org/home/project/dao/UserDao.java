package org.home.project.dao;

import org.home.project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Service
public class UserDao {
	@Autowired
	private MongoDatabase mongoDatabase;

	public User createUser(User user) {
		return null;
	}

	public User findUserById(String userId) {
		MongoCollection<User> collection = mongoDatabase.getCollection("users", User.class);
		// Access data.
		User person2 = collection.find().first();

		return person2;
	}

	public User findUser(User user) {
		return null;
	}

	public void deleteUser(User user) {
		return;
	}

	public User updateUser(User user) {
		return null;
	}
}
