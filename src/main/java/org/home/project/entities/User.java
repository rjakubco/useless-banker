package org.home.project.entities;

import org.mongojack.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@ToString
public class User {

	@ObjectId
	@Getter
	@Setter
	@JsonProperty("_id")
	private String id;

	@Getter
	@Setter
	private String username;

	@Getter
	@Setter
	private String password;

}