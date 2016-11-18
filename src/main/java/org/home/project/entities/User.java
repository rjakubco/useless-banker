package org.home.project.entities;

import eu.dozd.mongo.annotation.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Entity
@ToString
public class User {

	@eu.dozd.mongo.annotation.Id
	@Getter
	@Setter
	private String id;

	@Getter
	@Setter
	private String username;

	@Getter
	@Setter
	private String password;
}
