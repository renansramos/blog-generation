package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController // Anotação que diz para Spring que essa é uma controladora de rotas e acesso aos métodos 
@RequestMapping("/postagens") //rota para chegar nessa classe "Insominia"
@CrossOrigin(origins = "*", allowedHeaders = "*") //Liberar o acesso a outras rotas 
public class PostagemController {
	
	@Autowired //Injeção de dependência | Instanciar a classe PostagemRepository
	private PostagemRepository postagemRepository;
	
	@GetMapping //Define o método http que atende esse método 
	public ResponseEntity<List<Postagem>> getAll(){
		//ResponseEntity - Classe do 
		return ResponseEntity.ok(postagemRepository.findAll());
		//SELECT * FROM tb_postagens
	}
	
}
