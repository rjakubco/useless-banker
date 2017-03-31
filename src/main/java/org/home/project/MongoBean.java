package org.home.project;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.home.project.dao.HistoryDao;
import org.home.project.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class MongoBean implements Processor {
	@Autowired
	private HistoryDao historyDao;
	@Autowired
	private UserDao userDao;


	public void process(Exchange exchange) throws Exception {
		// TODO: get transactions, check headers, create transactions in DB and create their ID and update History with them
		List transactions = exchange.getIn().getBody(ArrayList.class);

	}
}
