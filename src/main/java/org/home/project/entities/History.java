package org.home.project.entities;

import java.util.List;

import eu.dozd.mongo.annotation.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Entity
public class History {

	@eu.dozd.mongo.annotation.Id
	@Getter
	@Setter
	private String id;

	@Getter
	@Setter
	private String userId;

	@Getter
	@Setter
	private List<String> transactionIds;
}
