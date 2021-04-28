package com.devsuperior.myFirstProject.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.myFirstProject.entities.Category;
import com.devsuperior.myFirstProject.repositories.CategoryRepository;

//Para que o Spring reconheça como recurso REST
@RestController
//Pra que tenha o mapeamento de uma url ou caminho
@RequestMapping(value = "/categories")
public class CategoryResource{
	
	@Autowired
	private CategoryRepository categoryRepository;

	//Primeira operação encontrar todos
	//O framework vai processar e preparar para responder via requisição get o /categories
	// Depois da requisição vai ser chamado o método em seguida
	@GetMapping
	//Inserir o tipo da respostas entre o <>
	public ResponseEntity<List<Category>> findAll() {
		List <Category> list = categoryRepository.findAll();
		//Instanciar uma resposta de código 200 do protocolo http, que deu certo
		return ResponseEntity.ok().body(list);
	}

	//A diferença é que agora vamos inserir um id
	 @GetMapping(value = "/{id}") 
	 public ResponseEntity<Category> 
	 //O PathVariable vai reconhecer o número do id que colocarmos na url
	 findById(@PathVariable Long id) { 
		 Category cat = categoryRepository.findById(id);
		  return ResponseEntity.ok().body(cat); 
	 }
	 
}