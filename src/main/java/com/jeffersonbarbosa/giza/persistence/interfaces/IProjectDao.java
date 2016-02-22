package com.jeffersonbarbosa.giza.persistence.interfaces;

import java.util.Date;
import java.util.List;

import com.jeffersonbarbosa.giza.persistence.dao.Dao;

public interface IProjectDao<Project> extends Dao<Project> {
	List<Project> findProjectsSubmittedSince(Date date);
}