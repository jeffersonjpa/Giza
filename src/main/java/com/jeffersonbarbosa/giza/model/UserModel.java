package com.jeffersonbarbosa.giza.model;

import javax.persistence.Entity;

@Entity
public class UserModel extends EntityModel {
	
	private static final long serialVersionUID = 5135090961434183759L;
	private String name;
	
	public UserModel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
