package com.jeffersonbarbosa.giza.persistence.implementation;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jeffersonbarbosa.giza.persistence.dao.Dao;

public abstract class JpaGenericDao<Task> implements Dao<Task> {
	
	public static final String PERSISTENCE_UNIT_NAME = "giza-project";
	
	protected Class entityClass;

//	@PersistenceContext(name=PERSISTENCE_UNIT_NAME, type=PersistenceContextType.EXTENDED)
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("giza-project");
	protected EntityManager entityManager = factory.createEntityManager();
	
	public JpaGenericDao() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class) genericSuperclass.getActualTypeArguments()[0];
	}
}