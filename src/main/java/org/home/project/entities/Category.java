package org.home.project.entities;

import org.mongojack.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class Category {
	@ObjectId
	@Getter
	@Setter
	@JsonProperty("_id")
	private String id;

	@Getter
	@Setter
	private String name;
}
