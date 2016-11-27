package org.home.project.entities;

import org.mongojack.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class Transaction {

	@ObjectId
	@Getter
	@Setter
	@JsonProperty("_id")
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
