package com.devsuperior.myFirstProject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.devsuperior.myFirstProject.entities.Product;

//Anotação que reconhece a sua classe como um cara que vai participar do mecanismo de gestão de dependência 
@Component
public class ProductRepository {
	
	//Dicionário de pares e valor
	private Map<Long, Product> map = new HashMap<>();

	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}
}