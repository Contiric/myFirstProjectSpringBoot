package com.devsuperior.myFirstProject.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myFirstProject.entities.Category;

//Anotação que reconhece a sua classe como um cara que vai participar do mecanismo de gestão de dependência 
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	/*
	 * //Dicionário de pares e valor private Map<Long, Category> map = new
	 * HashMap<>();
	 * 
	 * public void save(Category obj) { map.put(obj.getId(), obj); }
	 * 
	 * public Category findById(Long id) { return map.get(id); }
	 * 
	 * public List<Category> findAll() { return new
	 * ArrayList<Category>(map.values()); }
	 */
	
	
}