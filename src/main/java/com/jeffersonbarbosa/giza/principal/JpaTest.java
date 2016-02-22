package com.jeffersonbarbosa.giza.principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jeffersonbarbosa.giza.model.Task;
import com.jeffersonbarbosa.giza.persistence.dao.TaskDao;

public class JpaTest {
	
	private EntityManager manager;
	
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TaskDao dao = new TaskDao();
		
		Task task = new Task("Sistema Giza", "Desenvolvimento do Sistema Giza.");
		
		dao.persist(task);
		
//		JpaTest test = new JpaTest(manager);
		
//		EntityTransaction tx = manager.getTransaction();
//		tx.begin();
//		try {
//			test.createTask();
//			test.listTasks();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		tx.commit();
	}

//	private void createTask() {
//		manager.persist();
//	}
	
//	private void delete(Task task) {
//		manager.remove(task);
//	}

//	private void listTasks() {
//		List<Task> resultList = manager.createQuery("Select a From Task a", Task.class).getResultList();
//		System.out.println("num of tasks:" + resultList.size());
//		for (Task task : resultList) {
//			System.out.println("next task: " + task);
//		}
//	}

}