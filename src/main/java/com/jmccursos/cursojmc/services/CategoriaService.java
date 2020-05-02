package com.jmccursos.cursojmc.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmccursos.cursojmc.domain.Categoria;
import com.jmccursos.cursojmc.repositories.CategoriaRepository;


@Service
public class CategoriaService {
	
	@Autowired
	public CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
		 
	}
		
	
}
