package org.home.project.parsers;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.home.project.dao.MerchantDao;
import org.home.project.dao.TransactionDao;
import org.home.project.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class Converter implements Processor {
	@Autowired
	private MerchantDao merchantDao;

	@Autowired
	private TransactionDao transactionDao;

	public void process(Exchange exchange) throws Exception {
		// take inBody and convert it to transaction and send

		//TODO: copy headers and mainly userId
		exchange.getOut().setBody(convertStringToHistory(exchange.getIn().getBody(String.class)));
	}

	/*
	datum zaúčtování:  3.11.2016
	částka:            -142.00
	měna:              CZK
	zůstatek:          -14868.66
	konstantní symbol: 6178
	variabilní symbol: 205000307
	specifický symbol: 2500732610
	označení operace:  Čerpání úvěru platební kartou
	název protiúčtu:
	protiúčet:
	poznámka:          Částka: 142 CZK 01.11.2016; Místo: LEKARNA ORION LESNA; BRNO


	 */
	public List<Transaction> convertStringToHistory(String transactionsString) {
		String[] transactions = transactionsString
				.replaceAll("(?m)(^ *| +(?= |$))", "")
				.replaceAll("(?m)^$([\r\n]+?)(^$[\r\n]+?^)+", "$1")
				.split("(?m:^(?=[\\r\\n]|\\z))");

		List<Transaction> transactionList = new ArrayList<Transaction>();

//		for (String temp : transactions) {
//			if (!temp.contains("datum zaúčtování")) {
//				continue;
//			}
//			Transaction transaction = new Transaction();
//			// Parse operation
//			transaction.setOperation(StringUtils.substringBetween(temp, "označení operace:", "\n").trim());
//			// Parse date
//			transaction.setPayDate(StringUtils.substringBetween(temp, "datum zaúčtování:", "\n").trim());
//			//Parse amount
//			transaction.setAmount(Integer.parseInt(StringUtils.substringBetween(temp, "částka:", "\n").trim()));
//			// Some logic to find merchant...
//			String accountNumber = StringUtils.substringBetween(temp, "protiúčet:", "\n").trim();
//			Merchant merchant = merchantDao.findMerchantByAccount(accountNumber);
//
//			if (merchant == null) {
//				merchant = merchantDao.findMerchantByName(StringUtils.substringBetween(temp, "poznámka:", "\n").trim());
//				if (merchant == null) {
//					Merchant newMerchant = new Merchant();
//					newMerchant.setContraAccount(Integer.parseInt(accountNumber));
//					newMerchant.setName(StringUtils.substringBetween(temp, "Místo:", ";").trim());
//					newMerchant.setCategoryId(null);
//					newMerchant.setPlace(StringUtils.substringAfterLast(temp, ";").trim());
//
//					merchantDao.createMerchant(newMerchant);
//					merchant = merchantDao.findMerchant(newMerchant);
//				}
//			}
//
//			transaction.setMerchantId(merchant.getId());
//			transactionList.add(transaction);
//
//			// TODO: docasne na skusanie angularu
//			transactionDao.createTransaction(transaction);
//		}

		return transactionList;
	}
}
