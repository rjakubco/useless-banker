package org.home.project.entities;

import eu.dozd.mongo.annotation.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Entity
public class Merchant {

	@eu.dozd.mongo.annotation.Id
	@Getter
	@Setter
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
