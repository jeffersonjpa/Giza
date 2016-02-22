package com.jeffersonbarbosa.giza.persistence.interfaces;

import java.util.Date;
import java.util.List;

import com.jeffersonbarbosa.giza.persistence.dao.Dao;

public interface ITaskDao<Task> extends Dao<Task> {
	List<Task> findTasksSubmittedSince(Date date);
}