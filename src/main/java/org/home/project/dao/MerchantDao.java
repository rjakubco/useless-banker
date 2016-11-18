package org.home.project.dao;

import org.home.project.entities.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.client.MongoDatabase;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Service
public class MerchantDao {
	@Autowired
	private MongoDatabase mongoDatabase;

	public Merchant createMerchant(Merchant merchant) {
		return null;
	}

	public Merchant findMerchantById(String id) {
		return null;
	}

	public Merchant findMerchant(Merchant merchant) {
		return merchant;
	}

	public void deleteMerchatn(Merchant merchant) {
		return;
	}

	public Merchant updateMerchant(Merchant merchant) {
		return null;
	}

	public Merchant findMerchantByName(String name) {
		return null;
	}

	public Merchant findMerchantByAccount(String account){
		return null;
	}
}
