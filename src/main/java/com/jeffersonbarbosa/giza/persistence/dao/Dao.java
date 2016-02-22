package com.jeffersonbarbosa.giza.persistence.dao;

public interface Dao<E> {
      void persist(E entity);
      void remove(E entity);
      void removeById(Long id);
      E findById(Long id);
      void update(E entity);
}