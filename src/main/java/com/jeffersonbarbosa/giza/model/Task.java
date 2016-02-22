package com.jeffersonbarbosa.giza.model;

import javax.persistence.Entity;

@Entity
public class Task extends EntityModel {
	
	private static final long serialVersionUID = -5062943860771417317L;
	private String name;
	private String description;
	
	public Task() {
		super();
	}
	
	public Task(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Task: Name: " + this.name + ", Description: " + this.description; 
	}
}
