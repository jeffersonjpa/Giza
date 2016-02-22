package com.jeffersonbarbosa.giza.persistence.dao;

import java.util.Date;
import java.util.List;

import com.jeffersonbarbosa.giza.model.Task;

public interface ITaskDao<Task> extends Dao<Task> {
	List<Task> findTasksSubmittedSince(Date date);
}