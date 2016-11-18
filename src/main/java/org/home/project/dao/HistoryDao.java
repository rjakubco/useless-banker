package org.home.project.dao;

import org.home.project.entities.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.client.MongoDatabase;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Service
public class HistoryDao {
	@Autowired
	private MongoDatabase mongoDatabase;

	public History createHistory(History history) {
		return null;
	}

	public History findHistoryById(String id) {
		return null;
	}

	public History findHistory(History history) {
		return null;
	}

	public void deleteHistory(History history) {
		return;
	}

	public History updateHistory(History history) {
		return null;
	}
}
