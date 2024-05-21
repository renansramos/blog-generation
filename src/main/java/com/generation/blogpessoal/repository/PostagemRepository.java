package com.generation.blogpessoal.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//JPA Repository - Classe JPA - metodos que vão realizar Query no banco 
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	//SELECT * from tb_postagens
	

}
