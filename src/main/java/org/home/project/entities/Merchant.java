package org.home.project.entities;

import org.mongojack.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class Merchant {

	@ObjectId
	@Getter
	@Setter
	@JsonProperty("_id")
	private String id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private Integer contraAccount;

	@Getter
	@Setter
	private String categoryId;

	@Getter
	@Setter
	private String place;
}
