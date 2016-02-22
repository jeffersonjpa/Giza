package com.jeffersonbarbosa.giza.persistence.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import com.jeffersonbarbosa.giza.model.Task;

public class TaskDao extends JpaDao<Task> implements ITaskDao<Task> {
	
	public List<Task> findOrdersSubmittedSince(Date date) {
		Query q = entityManager.createQuery("SELECT e FROM " + entityClass.getName() + " e WHERE date >= :date_since");
		q.setParameter("date_since", date);
		return (List) q.getResultList();
	}

	public void persist(Task task) {
		entityManager.getTransaction().begin();
        entityManager.persist(task);
        entityManager.getTransaction().commit();
	}

	/**
	 * Delete task by their Id.
	 *
	 * @param id
	 *            the task Id.
	 */
	public void removeById(Long id) {
		Task task = entityManager.find(Task.class, id);
		if (task != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(task);
			entityManager.getTransaction().commit();
		}
	}
	
	 /**
     * Delete task entity.
     *
     * @param task the object to be deleted.
     */
    public void remove(Task task) {
        entityManager.getTransaction().begin();
        entityManager.remove(task);
        entityManager.getTransaction().commit();
    }

	public Task findById(Task id) {
		Task task = entityManager.find(Task.class, id);

		if (task == null) {
			throw new EntityNotFoundException("Can't find Task for ID " + id);
		}
		return task;
	}

	public List<Task> findTasksSubmittedSince(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public Task findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
