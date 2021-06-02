package com.example.democrud.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI<T, ID extends Serializable> {

	//interface generica guarda los metodos crud para cualquier enntidad,y por ende el tipo de dato en el  ID
	
	T save(T entity);
	
	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
}
