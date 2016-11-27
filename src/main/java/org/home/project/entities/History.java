package org.home.project.entities;

import org.mongojack.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class History {

	@ObjectId
	@Getter
	@Setter
	@JsonProperty("_id")
	private String id;

	@Getter
	@Setter
	private String userId;

	@Getter
	@Setter
	private List<String> transactionIds;
}
