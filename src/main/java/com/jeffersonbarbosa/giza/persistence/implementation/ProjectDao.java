package com.jeffersonbarbosa.giza.persistence.implementation;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import com.jeffersonbarbosa.giza.model.Project;
import com.jeffersonbarbosa.giza.persistence.interfaces.IProjectDao;

public class ProjectDao extends JpaGenericDao<Project> implements IProjectDao<Project> {
	
	public List<Project> findOrdersSubmittedSince(Date date) {
		Query q = entityManager.createQuery("SELECT e FROM " + entityClass.getName() + " e WHERE date >= :date_since");
		q.setParameter("date_since", date);
		return q.getResultList();
	}

	public void persist(Project project) {
		entityManager.getTransaction().begin();
        entityManager.persist(project);
        entityManager.getTransaction().commit();
	}

	/**
	 * Delete project by their Id.
	 *
	 * @param id
	 *            the project Id.
	 */
	public void removeById(Long id) {
		Project project = entityManager.find(Project.class, id);
		if (project != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(project);
			entityManager.getTransaction().commit();
		}
	}
	
	 /**
     * Update Project information.
     *
     * @param project an Project to be updated.
     */
    public void update(Project project) {
        entityManager.getTransaction().begin();
        entityManager.merge(project);
        entityManager.getTransaction().commit();
    }
	
	 /**
     * Delete project entity.
     *
     * @param project the object to be deleted.
     */
    public void remove(Project project) {
        entityManager.getTransaction().begin();
        entityManager.remove(project);
        entityManager.getTransaction().commit();
    }

	public Project findById(Long id) {
		Project project = entityManager.find(Project.class, id);

		if (project == null) {
			throw new EntityNotFoundException("Can't find Project for ID " + id);
		}
		return project;
	}

	public List<Project> findProjectsSubmittedSince(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
}
