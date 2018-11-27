package com.papelaria.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.papelaria.blog.model.Post;
import com.papelaria.blog.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos posts inseridos
	public List<Post> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um post a partir do ID
	public Post findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um post
	public Post save(Post post) {
		return repository.saveAndFlush(post);
	}
	
	//Exclui um post
	public void delete(Long id) {
		repository.delete(id);
	}
}
