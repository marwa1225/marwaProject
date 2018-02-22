package tn.esprit.marwa.marwa.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.marwa.marwa.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
