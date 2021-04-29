package com.devsuperior.myFirstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myFirstProject.entities.Product;

//Anotação que reconhece a sua classe como um cara que vai participar do mecanismo de gestão de dependência 
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
//	//Dicionário de pares e valor
//	private Map<Long, Product> map = new HashMap<>();
//
//	public void save(Product obj) {
//		map.put(obj.getId(), obj);
//	}
//
//	public Product findById(Long id) {
//		return map.get(id);
//	}
//	
//	public List<Product> findAll() {
//		return new ArrayList<Product>(map.values());
//	}
	
	
}