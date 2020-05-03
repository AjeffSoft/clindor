package com.ajeff.clindor.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Servico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Preencha o nome do serviço")
	@Size (min=2, max=50, message = "Nome entre 2 e 50 caracteres")
	private String nome;
	
	@NotNull(message = "Informe o valor do serviço")
	private BigDecimal valor;
	
	
	@PrePersist @PreUpdate	
	private void prePersistUpdate() {
		this.nome = this.nome.toUpperCase();
	}
	

}
