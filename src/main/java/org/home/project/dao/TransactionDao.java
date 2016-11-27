package org.home.project.dao;

import org.home.project.entities.Transaction;
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
public class TransactionDao {
	@Autowired
	private DB mongoDatabase;

	public String createTransaction(Transaction transaction) {
		WriteResult<Transaction, String> writeResult = getCollection().insert(transaction);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		return writeResult.getSavedId();
	}

	public Transaction findTransactionById(String transactionId) {
		return getCollection().findOneById(transactionId);
	}

	public List<Transaction> findAllTransactions() {
		List<Transaction> userList = new ArrayList<Transaction>();
		DBCursor<Transaction> users = getCollection().find();
		while (users.hasNext()) {
			userList.add(users.next());

		}
		return userList;
	}

	public void deleteTransaction(Transaction transaction) {
		WriteResult<Transaction, String> writeResult = getCollection().removeById(transaction.getId());
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
	}

	public String updateTransaction(Transaction transaction) {
		WriteResult<Transaction, String> writeResult = getCollection().updateById(transaction.getId(), transaction);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			//
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		// what to return?
		return writeResult.getWriteResult().toString();
	}

	private JacksonDBCollection<Transaction, String> getCollection() {
		DBCollection dbCollection = mongoDatabase.getCollection("transactions");
		JacksonDBCollection<Transaction, String> transactionColletion = JacksonDBCollection.wrap(dbCollection, Transaction.class, String.class);

		return transactionColletion;
	}
}
