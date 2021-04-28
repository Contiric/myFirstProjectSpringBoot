package com.devsuperior.myFirstProject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.devsuperior.myFirstProject.entities.Category;

//Anotação que reconhece a sua classe como um cara que vai participar do mecanismo de gestão de dependência 
@Component
public class CategoryRepository {
	
	//Dicionário de pares e valor
	private Map<Long, Category> map = new HashMap<>();

	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}

	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}
}