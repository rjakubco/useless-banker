package org.home.project.dao;

import org.home.project.entities.User;
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
public class UserDao {
	@Autowired
	private DB mongoDatabase;

	public String createUser(User user) {
		WriteResult<User, String> writeResult = getCollection().insert(user);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		return writeResult.getSavedId();
	}

	public User findUserById(String userId) {
		return getCollection().findOneById(userId);
	}

	public List<User> findAllUsers() {
		List<User> userList = new ArrayList<User>();
		DBCursor<User> users = getCollection().find();
		while (users.hasNext()) {
			userList.add(users.next());

		}
		return userList;
	}


	public User findUserByName(String username) {
		DBCursor<User> cursor = getCollection().find().is("username", username);
		if (cursor.hasNext()) {
			return cursor.next();
		} else {
			return null;
		}
	}

	public void deleteUser(User user) {
		WriteResult<User, String> writeResult = getCollection().removeById(user.getId());
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
	}

	public String updateUser(User user) {
		WriteResult<User, String> writeResult = getCollection().updateById(user.getId(), user);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			//
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		// what to return?
		return writeResult.getWriteResult().toString();
	}

	private JacksonDBCollection<User, String> getCollection() {

		DBCollection dbCollection = mongoDatabase.getCollection("users");
		JacksonDBCollection<User, String> scenarioCollection = JacksonDBCollection.wrap(dbCollection, User.class, String.class);

		return scenarioCollection;
	}
}
