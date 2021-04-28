package com.devsuperior.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myFirstProject.entities.Category;
import com.devsuperior.myFirstProject.repositories.CategoryRepository;

@SpringBootApplication
public class MyFirstProjectApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}
	
	//O que for implementado aqui vai para o startup da aplicação
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2l, "Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
