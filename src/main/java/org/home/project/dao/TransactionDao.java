package org.home.project.dao;

import org.home.project.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.client.MongoDatabase;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Service
public class TransactionDao {
	@Autowired
	private MongoDatabase mongoDatabase;

	public Transaction createTransaction(Transaction transaction) {
		return null;
	}

	public Transaction findTransactionById(String transacationId) {
		return null;
	}

	public Transaction findTransaction(Transaction transaction) {
		return null;
	}

	public Transaction updateTransaction(Transaction transaction) {
		return null;
	}

	public void deleteTransaction(Transaction transaction) {

	}
}
