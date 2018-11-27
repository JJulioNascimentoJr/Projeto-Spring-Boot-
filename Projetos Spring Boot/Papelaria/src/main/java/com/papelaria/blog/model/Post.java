package com.papelaria.blog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "tbl_papelaria")
public class Post  implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 150) 
	@NotBlank(message = "Nome � uma informa��o obrigataria.")
	private String nome;
	
	@Column(nullable = false, length = 150)
	@NotBlank(message = "Endere�o � uma informa��o obrigatoria.")
	private String endereco;
	
	@Column(nullable = false, length = 150)
	@NotBlank(message = "Cidade � uma informa��o obrigatoria.")
	private String cidade;
	
	@Column(nullable = false, length = 150)
	@NotBlank(message = "Telefone � uma informa��o obrigatoria.")
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
