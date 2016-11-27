package org.home.project.dao;

import org.home.project.entities.Merchant;
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
public class MerchantDao {
	@Autowired
	private DB mongoDatabase;

	public String createMerchant(Merchant merchant) {
		WriteResult<Merchant, String> writeResult = getCollection().insert(merchant);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		return writeResult.getSavedId();
	}

	public Merchant findMerchantById(String merchantId) {
		return getCollection().findOneById(merchantId);
	}

	public List<Merchant> findAllMerchants() {
		List<Merchant> userList = new ArrayList<Merchant>();
		DBCursor<Merchant> users = getCollection().find();
		while (users.hasNext()) {
			userList.add(users.next());
		}
		return userList;
	}

	public void deleteMerchant(Merchant merchant) {
		WriteResult<Merchant, String> writeResult = getCollection().removeById(merchant.getId());
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
	}

	public String updateMerchant(Merchant merchant) {
		WriteResult<Merchant, String> writeResult = getCollection().updateById(merchant.getId(), merchant);
		if (!writeResult.getWriteResult().wasAcknowledged()) {
			//
			throw new RuntimeException(writeResult.getWriteResult().toString());
		}
		// what to return?
		return writeResult.getWriteResult().toString();
	}

	private JacksonDBCollection<Merchant, String> getCollection() {
		DBCollection dbCollection = mongoDatabase.getCollection("merchants");
		JacksonDBCollection<Merchant, String> transactionColletion = JacksonDBCollection.wrap(dbCollection, Merchant.class, String.class);

		return transactionColletion;
	}
}
