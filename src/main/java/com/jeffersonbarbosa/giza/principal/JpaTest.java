package com.jeffersonbarbosa.giza.principal;

import java.util.HashSet;
import java.util.Set;

import com.jeffersonbarbosa.giza.model.Project;
import com.jeffersonbarbosa.giza.model.Task;
import com.jeffersonbarbosa.giza.model.UserModel;
import com.jeffersonbarbosa.giza.persistence.implementation.ProjectDao;
import com.jeffersonbarbosa.giza.persistence.interfaces.IProjectDao;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IProjectDao<Project> dao = new ProjectDao();
		
		UserModel jefferson = new UserModel();
		jefferson.setName("Jefferson Barbosa");
		
		Task task1 = new Task("Casamento Projet", "Desenvolver o Termo de Abertura do Projeto.");
		
		Project projectUpdate = (Project) dao.findById(new Long(39));
		
		projectUpdate.setName("Now is my project.");
		
		projectUpdate.setOwner(jefferson);
		
		Set<Task> tasks = new HashSet<Task>();
		tasks.add(task1);
		
		projectUpdate.setTasks(tasks);
		
		dao.update(projectUpdate);
	}
}