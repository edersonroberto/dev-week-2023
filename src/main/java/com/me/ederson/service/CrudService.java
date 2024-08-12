package com.me.ederson.service;

import java.util.List;

import org.glassfish.jaxb.core.v2.model.core.ID;

public interface CrudService<ID, T> {

	List<T> findAll();

	T findById(ID id);

	T create(T entity);

	T update(ID id, T entity);

	void delete(ID id);

}
