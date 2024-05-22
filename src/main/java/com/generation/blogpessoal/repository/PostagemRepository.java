package com.generation.blogpessoal.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

//JPA Repository - Classe JPA - metodos que vão realizar Query no banco 

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	//SELECT * from tb_postagens
	
	
	//SELECT * FROM tb_postagens WHERE titulo LIKE "%POST%"; = findAllbyTituloContainingIgnoreCase
	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
    
}