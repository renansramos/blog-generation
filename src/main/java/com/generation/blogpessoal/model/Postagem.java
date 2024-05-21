package com.generation.blogpessoal.model;



import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity //Classe que vai tornar uma entidade de banco de dados
@Table(name = "tb_postagens") // Nomeando a tabela no banco de dados de tb_postagens
public class Postagem {
	
	@Id //tornar o campo uma chave primaria no banco de dados.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // tornando a chave primaria auto incrment 
	private Long id;
	
	@NotBlank(message = "O atributo TÍTULO é obrigatório!") //validation - validar o nosso atributo NN e tambem não vazio 
	@Size(min=5, max = 100, message= "O atributo TÍTULO deve ter no mínimo 5 carcateres e no máximo 100 caracteres!")
	private String titulo;
	
	@NotBlank(message="O atributo TEXTO é obrigatório!")
	@Size(min=5, max = 100, message= "O atributo TEXTO deve ter no mínimo 5 carcateres e no máximo 100 caracteres!")
	private String texto;
	
	@UpdateTimestamp // pega a data e hora do sistema e preenche no banco de dados
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
