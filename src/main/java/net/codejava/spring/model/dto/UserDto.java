package net.codejava.spring.model.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	public UserDto() {
		super();
	}
	
	private Long id;
	
	private String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	
}