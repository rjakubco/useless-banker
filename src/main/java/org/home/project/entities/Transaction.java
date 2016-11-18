package org.home.project.entities;

import eu.dozd.mongo.annotation.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Entity
public class Transaction {

	@eu.dozd.mongo.annotation.Id
	@Getter
	@Setter
	private String id;

	@Getter
	@Setter
	private String operation;

	@Getter
	@Setter
	private Integer amount;

	// TODO: not sure if how to store date for now.. if use stupid java Date or just string and parse it later
	@Getter
	@Setter
	private String payDate;

	@Getter
	@Setter
	private String merchantId;
}
