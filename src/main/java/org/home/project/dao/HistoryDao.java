package org.home.project.dao;

import org.home.project.entities.History;
import org.mongojack.DBQuery;
import org.mongojack.JacksonDBCollection;
import org.mongojack.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Service
public class HistoryDao {
	@Autowired
	private DB mongoDatabase;

	public String createHistory(History history) {
		WriteResult<History, String> writeResult = getHistoryCollection().insert(history);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		return writeResult.getSavedId();
	}

	public History findHistoryById(String historyId) {
		return getHistoryCollection().findOneById(historyId);
	}

	public History findHistoryByUserId(String userId) {
		return getHistoryCollection().findOne(DBQuery.is("userId", userId));
	}

	public void deleteHistory(History history) {
		// TODO: Delete all transactions
		for(String transactionId : history.getTransactionIds()){
			getTransactionHistory().removeById(transactionId);
		}

		WriteResult<History, String> writeResult = getHistoryCollection().removeById(history.getId());
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
	}

	public String updateHistory(History history) {
		WriteResult<History, String> writeResult = getHistoryCollection().updateById(history.getId(), history);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			//
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		// what to return?
		return writeResult.getWriteResult().toString();
	}

	private JacksonDBCollection<History, String> getHistoryCollection() {
		DBCollection dbCollection = mongoDatabase.getCollection("histories");
		JacksonDBCollection<History, String> transactionColletion = JacksonDBCollection.wrap(dbCollection, History.class, String.class);

		return transactionColletion;
	}

	private JacksonDBCollection<History, String> getTransactionHistory() {
		DBCollection dbCollection = mongoDatabase.getCollection("transactions");
		JacksonDBCollection<History, String> transactionColletion = JacksonDBCollection.wrap(dbCollection, History.class, String.class);

		return transactionColletion;
	}
}
