package com.jeffersonbarbosa.giza.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Project extends EntityModel {

	private static final long serialVersionUID = -4557156260590504499L;
	private String name;
	private Date beginProject;
	private Date endProject;
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UserModel owner;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Task> tasks = new HashSet<Task>(); 
	
	public Project() {
		super();
	}

	public Project(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
	public Date getBeginProject() {
		return beginProject;
	}

	public void setBeginProject(Date beginProject) {
		this.beginProject = beginProject;
	}

	public Date getEndProject() {
		return endProject;
	}

	public void setEndProject(Date endProject) {
		this.endProject = endProject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserModel getOwner() {
		return owner;
	}

	public void setOwner(UserModel owner) {
		this.owner = owner;
	}
}
